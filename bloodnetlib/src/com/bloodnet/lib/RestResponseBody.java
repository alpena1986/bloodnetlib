package com.bloodnet.lib;

public class RestResponseBody {
	
	private String code;
	private String name;
	private String message;
	
	public static final String CODE_SUCCESS = "10001";
	
	public static final String NAME_SUCCESS = "success";
	
	public static final String CODE_BAD_REQUEST = "20001";
	public static final String NAME_BAD_REQUEST = "bad request";
	
	public static final String CODE_USER_NOT_FOUND = "20011";
	public static final String NAME_USER_NOT_FOUND = "user not found";
	
	public static final String CODE_USER_ALREADY_EXIST = "20012";
	public static final String NAME_USER_ALREADY_EXIST = "user already exist";
	
	public static RestResponseBody SUCCESS = new RestResponseBody(CODE_SUCCESS, NAME_SUCCESS , "success");
	
	public static RestResponseBody BAD_REQUEST = new RestResponseBody(CODE_BAD_REQUEST, NAME_BAD_REQUEST , "bad request");
	
	public RestResponseBody(String code, String name, String message){
		this.code = code;
		this.name = name;
		this.message = message;
	}
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
