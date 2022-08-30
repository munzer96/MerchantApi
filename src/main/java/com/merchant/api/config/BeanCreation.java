package com.merchant.api.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanCreation {

//    @Bean
//    public RestTemplate createRestTemplate() throws KeyStoreException, NoSuchAlgorithmException, KeyManagementException{
//        TrustStrategy trustStrategy = new TrustStrategy() {
//            @Override
//            public boolean isTrusted(java.security.cert.X509Certificate[] x509Certificates, String authType) throws java.security.cert.CertificateException {
//                return true;
//            }
//        };
//
//        SSLContext sslContext = SSLContexts.custom().loadTrustMaterial(null, trustStrategy).build();
//        SSLConnectionSocketFactory sslConnectionSocketFactory = new SSLConnectionSocketFactory(sslContext, new NoopHostnameVerifier());
//
//        CloseableHttpClient closeableHttpClient = HttpClients.custom().setSSLSocketFactory(sslConnectionSocketFactory).build();
//
//        HttpComponentsClientHttpRequestFactory httpComponentsClientHttpRequestFactory =
//                new HttpComponentsClientHttpRequestFactory();
//        httpComponentsClientHttpRequestFactory.setHttpClient(closeableHttpClient);
//        httpComponentsClientHttpRequestFactory.setConnectionRequestTimeout(30000);
//
//        RestTemplate restTemplate = new RestTemplate();
//        restTemplate.setRequestFactory(httpComponentsClientHttpRequestFactory);
//
//        return restTemplate;
//    }

    @Bean
    public ObjectMapper getObjectMapper() {
        return new ObjectMapper();
    }

//    @Bean
//    public WebClient webClient() {
//        return WebClient.builder()
//                .baseUrl("http://localhost:12457")
//                .clientConnector(new ReactorClientHttpConnector(
//                        HttpClient.create().responseTimeout(Duration.ofMillis(300))
//                ))
//                .build();
//    }

}
