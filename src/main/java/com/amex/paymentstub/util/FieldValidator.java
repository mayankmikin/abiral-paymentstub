package com.amex.paymentstub.util;

import com.amex.paymentstub.model.ApiResponseMessage;
import com.amex.paymentstub.model.AuthPushFields;
import com.amex.paymentstub.validation.AlphaNumericSpecialChar;

public class FieldValidator 
{
	 @AlphaNumericSpecialChar
	public static String dummyfieldl;
	public static ApiResponseMessage validate(AuthPushFields body)
	{
		// here annotation is validating  AuthPushFields check AuthPushfields
		ApiResponseMessage resp=new ApiResponseMessage();
		dummyfieldl=body.getTokenNumber();
		validateFieldsValues(body,resp);
		return resp;
		
	}
	   public static ApiResponseMessage validateFieldsValues(AuthPushFields body,ApiResponseMessage resp)
    {
    	
    	if(body.getFundingAccountNumber().length()<5)
    	{
    		resp.setCode(1);
    		resp.setMessage("some error mesage");
    	}
    	return resp;
    }
	   
}
