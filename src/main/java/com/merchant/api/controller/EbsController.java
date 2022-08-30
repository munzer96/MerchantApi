package com.merchant.api.controller;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import com.merchant.api.bean.CommonRequest;
import com.merchant.api.bean.CommonResponse;
import com.merchant.api.bean.EbsClientRequest;
import com.merchant.api.config.Constant;
import com.merchant.api.service.EbsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.ResourceAccessException;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.Context;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;


@RestController
@RequestMapping("/")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EbsController {


    Logger logger = LoggerFactory.getLogger(EbsController.class);

    @Autowired
    EbsService ebsService;


    @RequestMapping(value = "/pos/getBalance", consumes = {MediaType.APPLICATION_FORM_URLENCODED_VALUE, MediaType.APPLICATION_JSON_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_FORM_URLENCODED_VALUE})
    public ResponseEntity getBalance(@Context HttpServletRequest request, @RequestBody String clientString) {

        logger.info("Balance Inquiry");
        EbsClientRequest clientRequest = null;
        String remoteAddress = request.getRemoteAddr() + ":" + request.getRemotePort();
        ObjectMapper mapper = new ObjectMapper();
        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        logger.info("Remote v	" + request.getRemoteAddr());

        CommonRequest commonRequest = new CommonRequest();
        CommonResponse response = new CommonResponse();

        try {
            clientRequest = mapper.readValue(clientString, EbsClientRequest.class);
            commonRequest.setRequestData(clientRequest);
            commonRequest.setRemoteAddress(remoteAddress);
            response = body(commonRequest, Constant.EbsEndPoint.BALANCE_INQUIRY, Constant.ServiceType.BALANCE_INQUIRY);
            logger.info("response: " + response.toString());
            
        } catch (NullPointerException e) {

            return new ResponseEntity(response, HttpStatus.BAD_REQUEST);
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        return new ResponseEntity(response, HttpStatus.OK);
    }

    @RequestMapping(value = "/pos/doCardTransfer", consumes = {MediaType.APPLICATION_FORM_URLENCODED_VALUE, MediaType.APPLICATION_JSON_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_FORM_URLENCODED_VALUE})
    public ResponseEntity cardTransfer(@Context HttpServletRequest request, @RequestBody String clientString) {

        logger.info("Card Transfer");
        EbsClientRequest clientRequest = null;
        String remoteAddress = request.getRemoteAddr() + ":" + request.getRemotePort();
        ObjectMapper mapper = new ObjectMapper();
        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        logger.info("Remote v	" + request.getRemoteAddr());

        CommonRequest commonRequest = new CommonRequest();
        CommonResponse response = new CommonResponse();

        try {
            clientRequest = mapper.readValue(clientString, EbsClientRequest.class);
            commonRequest.setRequestData(clientRequest);
            commonRequest.setRemoteAddress(remoteAddress);
            response = body(clientRequest, Constant.EbsEndPoint.CARD_TRANSFER, Constant.ServiceType.CARD_TRANSFER);

            logger.info("response: " + response.toString());
            
            //System.out.println("Fields\t"+clientRequest);

        } catch (NullPointerException e) {

            logger.error("request: " + clientRequest.toString() + "\t" + e.getMessage());
            return new ResponseEntity(response, HttpStatus.BAD_REQUEST);

            //System.out.println("Fields\t"+clientRequest);
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return new ResponseEntity(response, HttpStatus.OK);
    }

    @RequestMapping(value = "/pos/purchase", consumes = {MediaType.APPLICATION_FORM_URLENCODED_VALUE, MediaType.APPLICATION_JSON_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_FORM_URLENCODED_VALUE})
    public ResponseEntity purchase(@Context HttpServletRequest request, @RequestBody String clientString) {

        logger.info("Purchase");
        EbsClientRequest clientRequest = null;
        String remoteAddress = request.getRemoteAddr() + ":" + request.getRemotePort();
        ObjectMapper mapper = new ObjectMapper();
        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        logger.info("Remote v	" + request.getRemoteAddr());

        CommonRequest commonRequest = new CommonRequest();
        CommonResponse response = new CommonResponse();

        try {
            clientRequest = mapper.readValue(clientString, EbsClientRequest.class);
            commonRequest.setRequestData(clientRequest);
            commonRequest.setRemoteAddress(remoteAddress);
            response = body(commonRequest, Constant.EbsEndPoint.PURCHASE, Constant.ServiceType.PURCHASE);

            logger.info("response: " + response.toString());
            

        } catch (NullPointerException e) {
            logger.error("request: " + clientRequest.toString() + "\t" + e.getMessage());
            //System.out.println("Fields\t"+clientRequest);


            return ResponseEntity.ok(response);
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return new ResponseEntity(response, HttpStatus.OK);
    }

    @RequestMapping(value = "/pos/purchaseCashBack", consumes = {MediaType.APPLICATION_FORM_URLENCODED_VALUE, MediaType.APPLICATION_JSON_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_FORM_URLENCODED_VALUE})
    public ResponseEntity purchaseWithCashBack(@Context HttpServletRequest request, @RequestBody String clientString) {

        logger.info("PurchaseWithCashBack");
        EbsClientRequest clientRequest = null;
        String remoteAddress = request.getRemoteAddr() + ":" + request.getRemotePort();
        ObjectMapper mapper = new ObjectMapper();
        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        logger.info("Remote v	" + request.getRemoteAddr());

        CommonRequest commonRequest = new CommonRequest();
        CommonResponse response = new CommonResponse();

        try {
            clientRequest = mapper.readValue(clientString, EbsClientRequest.class);
            commonRequest.setRequestData(clientRequest);
            commonRequest.setRemoteAddress(remoteAddress);
            response = body(clientRequest, Constant.EbsEndPoint.PURCHASE_WITH_CASH_BACK, Constant.ServiceType.PURCHASE_WITH_CASH_BACK);

            logger.info("response: " + response.toString());
            

            //System.out.println("Fields\t"+clientRequest);
        } catch (NullPointerException e) {
            logger.error("request: " + clientRequest.toString() + "\t" + e.getMessage());
            System.out.println("Fields\t" + clientRequest);


            return ResponseEntity.ok(response);
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return new ResponseEntity(response, HttpStatus.OK);
    }

    @RequestMapping(value = "/pos/purchaseMobile", consumes = {MediaType.APPLICATION_FORM_URLENCODED_VALUE, MediaType.APPLICATION_JSON_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_FORM_URLENCODED_VALUE})
    public ResponseEntity purchaseMobile(@Context HttpServletRequest request, @RequestBody String clientString) {

        logger.info("PurchaseMobile");
        EbsClientRequest clientRequest = null;
        String remoteAddress = request.getRemoteAddr() + ":" + request.getRemotePort();
        ObjectMapper mapper = new ObjectMapper();
        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        logger.info("Remote v	" + request.getRemoteAddr());

        CommonRequest commonRequest = new CommonRequest();
        CommonResponse response = new CommonResponse();

        try {
            clientRequest = mapper.readValue(clientString, EbsClientRequest.class);
            commonRequest.setRequestData(clientRequest);
            commonRequest.setRemoteAddress(remoteAddress);
            response = body(clientRequest, Constant.EbsEndPoint.PURCHASE_MOBILE, Constant.ServiceType.PURCHASE_MOBILE);

            logger.info("response: " + response.toString());
            

            //System.out.println("Fields\t"+clientRequest);
        } catch (NullPointerException e) {
            logger.error("request: " + clientRequest.toString() + "\t" + e.getMessage());
            System.out.println("Fields\t" + clientRequest);


            return ResponseEntity.ok(response);
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return new ResponseEntity(response, HttpStatus.OK);
    }


    @RequestMapping(value = "/pos/miniStatement", consumes = {MediaType.APPLICATION_FORM_URLENCODED_VALUE, MediaType.APPLICATION_JSON_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_FORM_URLENCODED_VALUE})
    public ResponseEntity miniStatement(@Context HttpServletRequest request, @RequestBody String clientString) {

        logger.info("Mini-Statement");
        EbsClientRequest clientRequest = null;
        String remoteAddress = request.getRemoteAddr() + ":" + request.getRemotePort();
        ObjectMapper mapper = new ObjectMapper();
        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        logger.info("Remote v	" + request.getRemoteAddr());

        CommonRequest commonRequest = new CommonRequest();
        CommonResponse response = new CommonResponse();

        try {
            clientRequest = mapper.readValue(clientString, EbsClientRequest.class);
            commonRequest.setRequestData(clientRequest);
            commonRequest.setRemoteAddress(remoteAddress);
            response = body(clientRequest, Constant.EbsEndPoint.MINI_STATEMENT, Constant.ServiceType.MINI_STATEMENT);

            logger.info("response: " + response.toString());
            

            //System.out.println("Fields\t"+clientRequest);
        } catch (NullPointerException e) {
            logger.error("request: " + clientRequest.toString() + "\t" + e.getMessage());
            //System.out.println("Fields\t"+clientRequest);


            return ResponseEntity.ok(response);
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return new ResponseEntity(response, HttpStatus.OK);
    }

    @RequestMapping(value = "/pos/refund", consumes = {MediaType.APPLICATION_FORM_URLENCODED_VALUE, MediaType.APPLICATION_JSON_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_FORM_URLENCODED_VALUE})
    public ResponseEntity refund(@Context HttpServletRequest request, @RequestBody String clientString) {

        logger.info("Refund");
        EbsClientRequest clientRequest = null;
        String remoteAddress = request.getRemoteAddr() + ":" + request.getRemotePort();
        ObjectMapper mapper = new ObjectMapper();
        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        logger.info("Remote v	" + request.getRemoteAddr());

        CommonRequest commonRequest = new CommonRequest();
        CommonResponse response = new CommonResponse();


        try {
            clientRequest = mapper.readValue(clientString, EbsClientRequest.class);
            commonRequest.setRequestData(clientRequest);
            commonRequest.setRemoteAddress(remoteAddress);
            response = body(clientRequest, Constant.EbsEndPoint.REFUND, Constant.ServiceType.REFUND);

            logger.info("response: " + response.toString());
            

            //System.out.println("Fields\t"+clientRequest);
        } catch (NullPointerException e) {
            logger.error("request: " + clientRequest.toString() + "\t" + e.getMessage());
            //System.out.println("Fields\t"+clientRequest);


            return ResponseEntity.ok(response);
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return new ResponseEntity(response, HttpStatus.OK);
    }

    @RequestMapping(value = "/pos/getBill", consumes = {MediaType.APPLICATION_FORM_URLENCODED_VALUE, MediaType.APPLICATION_JSON_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_FORM_URLENCODED_VALUE})
    public ResponseEntity billInquiry(@Context HttpServletRequest request, @RequestBody String clientString) {

        logger.info("Servlet \t" + request.toString() + "\t" + clientString);
        EbsClientRequest clientRequest = null;
        String remoteAddress = request.getRemoteAddr() + ":" + request.getRemotePort();
        ObjectMapper mapper = new ObjectMapper();
        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        logger.info("Remote \t" + request.getRemoteAddr());

        CommonRequest commonRequest = new CommonRequest();
        CommonResponse response = new CommonResponse();

        try {
            clientRequest = mapper.readValue(clientString, EbsClientRequest.class);
            commonRequest.setRequestData(clientRequest);
            commonRequest.setRemoteAddress(remoteAddress);
            response = body(clientRequest, Constant.EbsEndPoint.BILL_INQUIRY, Constant.ServiceType.BILL_INQUIRY);

            logger.info("response: " + response.toString());
            

            //System.out.println("Fields\t"+clientRequest);
        } catch (NullPointerException e) {
            logger.error("request: " + clientRequest.toString() + "\t" + e.getMessage());
            //System.out.println("Fields\t"+clientRequest);


            return ResponseEntity.ok(response);
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return new ResponseEntity(response, HttpStatus.OK);
    }

    @RequestMapping(value = "/pos/payBill", consumes = {MediaType.APPLICATION_FORM_URLENCODED_VALUE, MediaType.APPLICATION_JSON_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_FORM_URLENCODED_VALUE})
    public ResponseEntity billPayment(@Context HttpServletRequest request, @RequestBody String clientString) {

        logger.info("Bill Payment");
        EbsClientRequest clientRequest = null;
        String remoteAddress = request.getRemoteAddr() + ":" + request.getRemotePort();
        ObjectMapper mapper = new ObjectMapper();
        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        logger.info("Remote v	" + request.getRemoteAddr());

        CommonRequest commonRequest = new CommonRequest();
        CommonResponse response = new CommonResponse();

        try {
            clientRequest = mapper.readValue(clientString, EbsClientRequest.class);
            commonRequest.setRequestData(clientRequest);
            commonRequest.setRemoteAddress(remoteAddress);
            response = body(clientRequest,
                    Constant.EbsEndPoint.BILL_PAYMENT, Constant.ServiceType.BILL_PAYMENT);

            logger.info("response: " + response.toString());
            

            //System.out.println("Fields\t"+clientRequest);
        } catch (NullPointerException e) {
            logger.error("request: " + clientRequest.toString() + "\t" + e.getMessage());
            //System.out.println("Fields\t"+clientRequest);


            return ResponseEntity.ok(response);
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return new ResponseEntity(response, HttpStatus.OK);
    }

    @RequestMapping(value = "/pos/prepayBill", consumes = {MediaType.APPLICATION_FORM_URLENCODED_VALUE, MediaType.APPLICATION_JSON_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_FORM_URLENCODED_VALUE})
    public ResponseEntity billPrePayment(@Context HttpServletRequest request, @RequestBody String clientString) {

        logger.info("Bill Prepay");
        EbsClientRequest clientRequest = null;
        String remoteAddress = request.getRemoteAddr() + ":" + request.getRemotePort();
        ObjectMapper mapper = new ObjectMapper();
        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        logger.info("Remote v	" + request.getRemoteAddr());

        CommonRequest commonRequest = new CommonRequest();
        CommonResponse response = new CommonResponse();


        try {
            clientRequest = mapper.readValue(clientString, EbsClientRequest.class);
            commonRequest.setRequestData(clientRequest);
            commonRequest.setRemoteAddress(remoteAddress);
            response = body(clientRequest,
                    Constant.EbsEndPoint.BILL_PREPAYMENT, Constant.ServiceType.BILL_PREPAYMENT);

            logger.info("response: " + response.toString());

            //System.out.println("Fields\t"+clientRequest);
        } catch (NullPointerException e) {
            logger.error("request: " + clientRequest.toString() + "\t" + e.getMessage());
            //System.out.println("Fields\t"+clientRequest);


            return ResponseEntity.ok(response);
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return new ResponseEntity(response, HttpStatus.OK);
    }

    @RequestMapping(value = "/pos/doAccountTransfer", consumes = {MediaType.APPLICATION_FORM_URLENCODED_VALUE, MediaType.APPLICATION_JSON_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_FORM_URLENCODED_VALUE})
    public ResponseEntity accountTransfer(@Context HttpServletRequest request, @RequestBody String clientString) {

        logger.info("Account Transfer");
        EbsClientRequest clientRequest = null;
        String remoteAddress = request.getRemoteAddr() + ":" + request.getRemotePort();
        ObjectMapper mapper = new ObjectMapper();
        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        logger.info("Remote v	" + request.getRemoteAddr());

        CommonRequest commonRequest = new CommonRequest();
        CommonResponse response = new CommonResponse();

        try {
            clientRequest = mapper.readValue(clientString, EbsClientRequest.class);
            commonRequest.setRequestData(clientRequest);
            commonRequest.setRemoteAddress(remoteAddress);
            response = body(clientRequest, Constant.EbsEndPoint.ACCOUNT_TRANSFER, Constant.ServiceType.ACCOUNT_TRANSFER);


            logger.info("response: " + response.toString());

            //System.out.println("Fields\t"+clientRequest);
        } catch (NullPointerException e) {
            logger.error("request: " + clientRequest.toString() + "\t" + e.getMessage());
            //System.out.println("Fields\t"+clientRequest);


            return ResponseEntity.ok(response);
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return new ResponseEntity(response, HttpStatus.OK);
    }

    @RequestMapping(value = "/pos/isAlive",
            produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.POST)
    public ResponseEntity networkTest(@Context HttpServletRequest request, @RequestBody String clientString) {

        logger.info("Network Test");
        EbsClientRequest clientRequest = null;
        String remoteAddress = request.getRemoteAddr() + ":" + request.getRemotePort();
        ObjectMapper mapper = new ObjectMapper();
        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        logger.info("Remote v	" + request.getRemoteAddr());

        CommonRequest commonRequest = new CommonRequest();
        CommonResponse response = new CommonResponse();


        try {
            clientRequest = mapper.readValue(clientString, EbsClientRequest.class);
            commonRequest.setRequestData(clientRequest);
            commonRequest.setRemoteAddress(remoteAddress);
            logger.info("EbsController.networkTest: ");
            response = body(clientRequest,
                    Constant.EbsEndPoint.NETWORK_TEST, Constant.ServiceType.NETWORK_TEST);
            logger.info("EbsController.networkTest: Response ", response.toString());
        } catch (NullPointerException e) {
            logger.info("response: ", response.toString());
            return new ResponseEntity(response, HttpStatus.BAD_REQUEST);
        } catch (ResourceAccessException e) {
            e.printStackTrace();
            logger.info("request time out: " + e.getStackTrace().toString());
            return new ResponseEntity(response, HttpStatus.REQUEST_TIMEOUT);
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return new ResponseEntity(response, HttpStatus.OK);
    }

    @RequestMapping(value = "/pos/getWorkingKey", consumes = {MediaType.APPLICATION_FORM_URLENCODED_VALUE, MediaType.APPLICATION_JSON_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_FORM_URLENCODED_VALUE})
    public ResponseEntity workingKey(@Context HttpServletRequest request, @RequestBody String clientString) {

        logger.info("WorkingKey");
        EbsClientRequest clientRequest = null;
        String remoteAddress = request.getRemoteAddr() + ":" + request.getRemotePort();
        ObjectMapper mapper = new ObjectMapper();
        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        logger.info("Remote v	" + request.getRemoteAddr());

        CommonRequest commonRequest = new CommonRequest();
        CommonResponse response = new CommonResponse();


        try {
            clientRequest = mapper.readValue(clientString, EbsClientRequest.class);
            commonRequest.setRequestData(clientRequest);
            commonRequest.setRemoteAddress(remoteAddress);
            response = body(clientRequest,
                    Constant.EbsEndPoint.WORKING_KEY, Constant.ServiceType.WORKING_KEY);

            logger.info("response: " + response.toString());
            

            //System.out.println("Fields\t"+clientRequest);
        } catch (NullPointerException e) {
            logger.error("request: " + clientRequest.toString() + "\t" + e.getMessage());
            //System.out.println("Fields\t"+clientRequest);


            return ResponseEntity.ok(response);
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return new ResponseEntity(response, HttpStatus.OK);
    }

    @RequestMapping(value = "/pos/reversal", consumes = {MediaType.APPLICATION_FORM_URLENCODED_VALUE, MediaType.APPLICATION_JSON_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_FORM_URLENCODED_VALUE})
    public ResponseEntity reversal(CommonRequest clientRequest) {
        logger.info("Reverse Transaction");

        logger.info("Reversal Request: " + clientRequest.toString());

        CommonResponse response = new CommonResponse();

        try {
            response = body(clientRequest, Constant.EbsEndPoint.REVERSAL, Constant.ServiceType.REVERSAL);

            logger.info("Reversal response: " + response.toString());
            //System.out.println("Fields\t"+clientRequest);
        } catch (NullPointerException e) {
            logger.error("request: " + clientRequest.getRequestData().toString() + "\t" + e.getMessage());
            System.out.println("Fields\t" + clientRequest);


            return ResponseEntity.ok(response);
        }
        return new ResponseEntity(response, HttpStatus.OK);
    }


    public CommonResponse body(CommonRequest clientRequest, String url, Constant.ServiceType serviceType) {
        logger.debug("Sending Request Body");

        CommonResponse response = new CommonResponse();
        EbsClientRequest ebsClientRequest;
        ebsClientRequest = (EbsClientRequest) clientRequest.getRequestData();
        try {
            logger.info("RequestBody.service ");
            //Adding dateTime to the request
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("ddMMyyyyHHmmss", Locale.getDefault());
            Date date = new Date();
            //clientRequest.setSystemTraceAuditNumber(new Random().nextInt(999999));
            ebsClientRequest.setTranDateTime(simpleDateFormat.format(date));

            logger.info("ClientRequest: " + clientRequest.toString());

            response.setResponseData(ebsService.process(clientRequest,
                    url, serviceType));
            logger.info("EbsController Response: " + response.toString());

        } catch (NullPointerException e) {
            logger.info(String.valueOf(e.getStackTrace()));
        } catch (ResourceAccessException e) {

            logger.info("Request TimeOut: " + Arrays.toString(e.getStackTrace()));
            if ("PURCHASE".equalsIgnoreCase(serviceType.name()) || "PURCHASE_WITH_CASH_BACK".equalsIgnoreCase(serviceType.name())) {
                logger.info("Reversed Transaction: " + clientRequest);
                reversal(ebsClientRequest);
            }
        } catch (Exception e1) {
            logger.error(this + ":Can't initiate the ResponseCodeHandler", e1);

        }

        return response;
    }
}
