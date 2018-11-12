package com.paas.config.oauth2;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailService implements UserDetailsService {
	
	@Autowired
	DataSource dataSource;
	
	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
		User user = new User();
		List<SimpleGrantedAuthority> updatedAuthorities = new ArrayList<SimpleGrantedAuthority>();
		try {
			JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

			System.out.println("userName :: "+ userName);
			
			String SQL = "EXEC xfuse.dbo.p_getOAuth2UserInfo(?)";
			List<Map<String, Object>> rows = jdbcTemplate.queryForList(SQL,userName);
			System.out.println("loadUserByUsername : "+ rows);
			
			Map<String, Object> obj = (Map<String, Object>) rows.get(0);
			user.setUsername(((String) obj.get("UserName")).trim());
			user.setPassword(((String) obj.get("Password")).trim());
			user.setAccountNonExpired((int) obj.get("Expired") == 0);
			user.setAccountNonLocked((int) obj.get("Locked") == 0);
			user.setCredentialsNonExpired((int) obj.get("CredentialsExpired") == 0);
			user.setEnabled((int) obj.get("Enabled") == 1);
			updatedAuthorities.add(new SimpleGrantedAuthority("ROLE_" + ((String) obj.get("Roles")).trim()));
			user.setAuthorities(updatedAuthorities);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return user;
	}
}
