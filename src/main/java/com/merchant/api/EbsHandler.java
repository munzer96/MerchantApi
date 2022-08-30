package com.merchant.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.merchant.api.bean.CommonRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

@Component
public class EbsHandler {

    @Autowired
    RestTemplate restTemplate;
    @Autowired
    ObjectMapper objectMapper;


    public String sendRequest(CommonRequest request, HttpHeaders headers, URI url)  {

        RequestEntity<CommonRequest> requestEntity = new RequestEntity<CommonRequest>(request, headers, HttpMethod.POST, url);

        ResponseEntity<String> responseEntity = restTemplate.exchange(requestEntity, String.class);

        return responseEntity.getBody();
//        return objectMapper.readValue(responseEntity.getBody(), EbsResponse.class);
    }

}
