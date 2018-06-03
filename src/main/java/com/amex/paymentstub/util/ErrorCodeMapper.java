package com.amex.paymentstub.util;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

@Component
public class ErrorCodeMapper {
    
private Map<String, HttpStatus> errorCodeMap = buildMap();
    
    public HttpStatus getHttpStatusCode(String errorCode) {
        return errorCodeMap.get(errorCode);
    }

private Map<String, HttpStatus> buildMap() {
HashMap<String, HttpStatus> map = new HashMap<>();
/*        map.put(CardAcceptanceVerificationStatusService.PARTNER_REQUEST_ERROR, HttpStatus.BAD_REQUEST);
        map.put(CardAcceptanceVerificationStatusService.VENDOR_NOT_FOUND_ERROR, HttpStatus.NOT_FOUND);
        
        map.put(CardAcceptanceVerificationSupplierUploadService.NUMBER_OF_PAYEES_ERROR, HttpStatus.BAD_REQUEST);
        map.put(CardAcceptanceVerificationSupplierUploadService.PAYEE_NAME_ERROR, HttpStatus.BAD_REQUEST);
        map.put(CardAcceptanceVerificationSupplierUploadService.ADDRESS_EMPTY_ERROR, HttpStatus.BAD_REQUEST);
        map.put(CardAcceptanceVerificationSupplierUploadService.ADDRESS_LINE_1_ERROR, HttpStatus.BAD_REQUEST);
        map.put(CardAcceptanceVerificationSupplierUploadService.ADDRESS_LINE_2_ERROR, HttpStatus.BAD_REQUEST);
        map.put(CardAcceptanceVerificationSupplierUploadService.ADDRESS_CITY_ERROR, HttpStatus.BAD_REQUEST);
        map.put(CardAcceptanceVerificationSupplierUploadService.ADDRESS_REGION_CODE_ERROR, HttpStatus.BAD_REQUEST);
        map.put(CardAcceptanceVerificationSupplierUploadService.ZIP_CODE_ERROR, HttpStatus.BAD_REQUEST);
        map.put(CardAcceptanceVerificationSupplierUploadService.COUNTRY_CODE_ERROR, HttpStatus.BAD_REQUEST);
        map.put(CardAcceptanceVerificationSupplierUploadService.PHONE_NUMBER_ERROR, HttpStatus.BAD_REQUEST);
        map.put(CardAcceptanceVerificationSupplierUploadService.TAX_IDENTIFIER_ERROR, HttpStatus.BAD_REQUEST);
        
        map.put(CardAcceptanceVerificationApplication.SYSTEM_ERROR_CD, HttpStatus.INTERNAL_SERVER_ERROR);*/
        
        return map;
    }
}