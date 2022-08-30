package com.merchant.api.config;//package com.maxnet.merchant.config;
//
//import java.util.List;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.http.converter.HttpMessageConverter;
//import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
//import com.fasterxml.jackson.databind.ObjectMapper;
//
//@Configuration
//@ComponentScan("basePackages = com.maxnet.merchant")
//public class HttpHandler extends WebMvcConfigurationSupport{
//
//  // ObjectMapper этот класс предоставлен Джексоном, в основном используется для преобразования объекта в строку json и возврата его во внешний интерфейс
//  // Ссылка для справки: https://blog.csdn.net/zxc_user/article/details/79713586
//  @Bean
//  public ObjectMapper getObjectMapper() {
//    return new ObjectMapper();
//  }
//
//  @Bean
//  public MappingJackson2HttpMessageConverter messageConverter() {
//    MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter();
//    converter.setObjectMapper(getObjectMapper());
//    return converter;
//  }
//
//  @Override
//  public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
//    converters.add(messageConverter());
//    addDefaultHttpMessageConverters(converters);
//  }
//}