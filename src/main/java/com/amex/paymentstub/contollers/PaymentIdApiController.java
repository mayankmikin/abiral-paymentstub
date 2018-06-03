package com.amex.paymentstub.contollers;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.amex.paymentstub.model.ApiResponseMessage;
import com.amex.paymentstub.model.AuthPushFields;
import com.amex.paymentstub.services.PaymentIdApiService;
import com.amex.paymentstub.util.ErrorCodeMapper;
import com.fasterxml.jackson.databind.ObjectMapper;


@RestController
@RequestMapping("/cardnotifications")
public class PaymentIdApiController {

    private static final Logger log = LoggerFactory.getLogger(PaymentIdApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;
    @Autowired
    private PaymentIdApiService paymentService;
    
    @Autowired
    private ErrorCodeMapper errorCodeMapper;
    
    @org.springframework.beans.factory.annotation.Autowired
    public PaymentIdApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }
    @RequestMapping(value = "/payments/{paymentId}/authorizations",
            method = RequestMethod.POST)
    public ResponseEntity<ApiResponseMessage> createAuthorization(@RequestHeader(value="App-Name", required=true) String appName,@PathVariable("paymentId") Long paymentId,@Valid @RequestBody AuthPushFields body) {
        String accept = request.getHeader("Accept");
        System.out.println("payment id is "+ paymentId);
        ApiResponseMessage paymentServiceResponse=paymentService.createAuthorization(appName, paymentId, body);
        // here i will write error code mapper later
        return new ResponseEntity<ApiResponseMessage>(paymentServiceResponse,HttpStatus.OK);
    }
    
}
