package com.merchant.api.config;

public class Constant {

    //ebs public key
    public static String ebsPuk = "MFwwDQYJKoZIhvcNAQEBBQADSwAwSAJBAJ4HwthfqXiK09AgShnnLqAqMyT5VUV0hvSdG+ySMx+a54Ui5EStkmO8iOdVG9DlWv55eLBoodjSfd0XRxN7an0CAwEAAQ==";

    public static class EbsPrams{
        public static final String CLIENT_ID="MaxNet";
        public static final double DYNAMIC_FEES=7.0;
        public static final String ACCOUNT_TYPE="00";
    }

    //list of available services use to know the type of the service
    public static enum ServiceType{
        SERVICE_NAME,
        PURCHASE,
        PURCHASE_WITH_CASH_BACK,
        PURCHASE_MOBILE,
        REVERSAL,
        BALANCE_INQUIRY,
        MINI_STATEMENT,
        REFUND,
        BILL_INQUIRY,
        BILL_PAYMENT,
        BILL_PREPAYMENT,
        ACCOUNT_TRANSFER,
        CARD_TRANSFER,
        NETWORK_TEST,
        WORKING_KEY,
        PAYEES_LIST,
        CASH_IN,
        GENERATE_VOUCHER,
        CASH_OUT_VOUCHER,
        CASH_OUT_VOUCHER_WITH_AMOUNT,
        CHANGE_PIN,
        VOUCHER_CASH_IN,
        CASH_OUT,
        TRANSACTION_STATUS,
        VOID_PURCHASE,
        COMPLETE_TRANSACTION,


        }

    //list of ebs endpoint
    public static class EbsEndPoint{
//        public static final String EBS_URL="http://localhost:8181/max-pay/simulator";
public static final String EBS_URL = "https://172.16.199.1:8443/QAEBSGateway";

        public static final String CARD_TRANSFER = EBS_URL + "/doCardTransfer";
        public static final String PURCHASE = EBS_URL + "/purchase";
        public static final String PURCHASE_WITH_CASH_BACK = EBS_URL + "/purchaseWithCashBack";
        public static final String PURCHASE_MOBILE = EBS_URL + "/purchaseMobile";
        public static final String REVERSAL = EBS_URL + "/reverse";
        public static final String BALANCE_INQUIRY = EBS_URL + "/getBalance";
        public static final String MINI_STATEMENT = EBS_URL + "/getMiniStatement";
        public static final String REFUND = EBS_URL + "/refund ";
        public static final String BILL_INQUIRY = EBS_URL + "/getBill";
        public static final String BILL_PAYMENT = EBS_URL + "/payBill";
        public static final String BILL_PREPAYMENT = EBS_URL + "/prepayBill";
        public static final String ACCOUNT_TRANSFER = EBS_URL + "/doAccountTransfer";
        public static final String NETWORK_TEST = EBS_URL + "/isAlive";
        public static final String WORKING_KEY = EBS_URL + "/getWorkingKey";
        public static final String PAYEES_LIST = EBS_URL + "/getPayeesList";
        public static final String CHANGE_PIN = EBS_URL + "/changePin";
        public static final String VOUCHER_CASH_IN = EBS_URL + "/voucherCashIn";
        public static final String CASH_IN = EBS_URL + "/cashIn";
        public static final String CASH_OUT = EBS_URL + "/cashOut";
        public static final String GENERATE_VOUCHER = EBS_URL + "/generateVoucher";
        public static final String CASH_OUT_VOUCHER_WITH_AMOUNT = EBS_URL + "/cashOutVoucher";
        public static final String TRANSACTION_STATUS = EBS_URL + "/getTransactionStatus";
        public static final String VOID_PURCHASE = EBS_URL + "/void";
        public static final String COMPLETE_TRANSACTION = EBS_URL + "/completeTransaction";


    }

    /*
    response is class used to init the response code as type of response detail
     */
    public static class Response {
        public static final ResponseDetail SUCCESS = new ResponseDetail(0, "Success");
        public static final ResponseDetail FAILED = new ResponseDetail(96, "System Error");

        public static final ResponseDetail INVALID_URL = new ResponseDetail(-10, "Unable to parse remote url");
        public static final ResponseDetail TIMEOUT = new ResponseDetail(-11, "Remote connection timeout");
        public static final ResponseDetail INVALID_RESPONSE_SHAPE = new ResponseDetail(-12, "Remote response format error");

        public static final ResponseDetail NOT_FOUND = new ResponseDetail(-404, "Request entity not found");
    }

    /*
    class use to facilitate the creation of general response
    cause it map response code with response message
     */
    public static class ResponseDetail{
        public int responseCode;
        public String msg;

        public ResponseDetail(int responseCode, String msg){
            this.responseCode = responseCode;
            this.msg = msg;
        }

        public int getResponseCode() {
            return responseCode;
        }

        public void setResponseCode(int responseCode) {
            this.responseCode = responseCode;
        }

        public String getMsg() {
            return msg;
        }

        public void setMsg(String msg) {
            this.msg = msg;
        }
    }
}
