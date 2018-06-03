package com.amex.paymentstub.model;

import java.util.Map;

public class CustomResponse {
	String data;
	Map<String, String> errormap;
	
	
	public CustomResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public Map<String, String> getErrormap() {
		return errormap;
	}
	public void setErrormap(Map<String, String> errormap) {
		this.errormap = errormap;
	}

}
