package com.amex.paymentstub.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.amex.paymentstub.contollers.PaymentIdApiController;
import com.amex.paymentstub.model.ApiResponseMessage;
import com.amex.paymentstub.model.AuthPushFields;
import com.amex.paymentstub.util.FieldValidator;

@Service("paymentService")
public class PaymentIdApiServiceImpl implements PaymentIdApiService {
	private static final Logger log = LoggerFactory.getLogger(PaymentIdApiController.class);
	@Override
	public ApiResponseMessage createAuthorization(
			String appName, Long paymentId, AuthPushFields body) {
		log.info("inside PaymentIdApiStubImpl START");
		log.info("validating AuthPushFields body");
		ApiResponseMessage resp=FieldValidator.validate(body);	
		log.info("inside PaymentIdApiStubImpl END");
		return resp;
	}

	

}
