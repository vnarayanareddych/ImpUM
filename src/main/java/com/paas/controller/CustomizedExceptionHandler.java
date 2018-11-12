package com.paas.controller;


import static com.paas.utils.PaasUtils.removedSpecialCharFromException;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.UncategorizedSQLException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.paas.model.ErrorResponseDetails;
import com.paas.model.ServerResponse;

@ControllerAdvice
public class CustomizedExceptionHandler extends ResponseEntityExceptionHandler {

	@Autowired
	public Environment props;
    private String subErrorCode = "";
   
	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(UncategorizedSQLException.class)
	public final ResponseEntity<Object> handleSQLInternalException(UncategorizedSQLException sql,
			WebRequest request) {
		ServerResponse serverResponse = new ServerResponse().responseCode(props.getProperty("E1999")).responseReason(props.getProperty("E5555")).
				subStatusCode(String.valueOf(sql.getSQLException().getErrorCode())).subStatusDescription(removedSpecialCharFromException(sql.getSQLException().getMessage()));
		ErrorResponseDetails errorResponse = new ErrorResponseDetails();
		errorResponse.setServerResponse(serverResponse);
		return new ResponseEntity(errorResponse, HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(SQLException.class)
	public final ResponseEntity<Object> handlesSQLExceptions(Exception ex, WebRequest request) {
		
		ServerResponse serverResponse = new ServerResponse().responseCode(props.getProperty("E0000")).responseReason(props.getProperty("V0000")).
				subStatusCode(props.getProperty("E0000")).subStatusDescription("SQLException Details ---> " + ex.getMessage() + "Description ---> " + ex);
		ErrorResponseDetails errorResponse = new ErrorResponseDetails();
		errorResponse.setServerResponse(serverResponse);
		return new ResponseEntity(errorResponse, HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(IOException.class)
	public final ResponseEntity<Object> handleIOExceptions(Exception ex, WebRequest request) {
		ServerResponse serverResponse = new ServerResponse().responseCode(props.getProperty("E0000")).responseReason(props.getProperty("V0000")).
				subStatusCode(props.getProperty("E0000")).subStatusDescription("IOException Details ---> " + ex.getMessage() + "Description ---> " + ex);
		ErrorResponseDetails errorResponse = new ErrorResponseDetails();
		errorResponse.setServerResponse(serverResponse);
		return new ResponseEntity(errorResponse, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@ExceptionHandler(Exception.class)
	public final ResponseEntity<Object> handleAllExceptions(Exception ex, WebRequest request) {
		ServerResponse serverResponse = new ServerResponse().responseCode(props.getProperty("E0000")).responseReason(props.getProperty("V0000")).
				subStatusCode(props.getProperty("E0000")).subStatusDescription("Exception Details ---> " + ex.getMessage() + "Description ---> " + ex);
		ErrorResponseDetails errorResponse = new ErrorResponseDetails();
		errorResponse.setServerResponse(serverResponse);
		return new ResponseEntity(errorResponse, HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(ServletException.class)
	public final ResponseEntity<Object> handleMethodNotFoundExceptions(HttpServletResponse res, ServletRequest request) {
		ServerResponse serverResponse = new ServerResponse().responseCode(props.getProperty("E0000")).responseReason(props.getProperty("V0000")).
				subStatusCode(props.getProperty("E0000")).subStatusDescription("Servlet Exception Details ---> " + res.getStatus() + "Description ---> " + res);
		ErrorResponseDetails errorResponse = new ErrorResponseDetails();
		errorResponse.setServerResponse(serverResponse);
		return new ResponseEntity(errorResponse, HttpStatus.METHOD_NOT_ALLOWED);
	}
}
