package com.testing.gateway.config;


import com.testing.gateway.filter.ModifyResponseBodyFilter;
import com.testing.gateway.filter.ProcessRequestHeaderFilter;
import com.testing.gateway.filter.ResponseHeaderFilter;
import com.testing.gateway.filter.UserRequestBodyFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public ResponseHeaderFilter addResponseHeaderFilter() {
        return new ResponseHeaderFilter();
    }

    @Bean
    public UserRequestBodyFilter addUserRequestBodyFilter(){
        return new UserRequestBodyFilter();
    }

    @Bean
    public ModifyResponseBodyFilter addModifyResponseBodyFilter(){
        return new ModifyResponseBodyFilter();
    }

    @Bean
    public ProcessRequestHeaderFilter addProcessRequestHeaderFilter(){
        return new ProcessRequestHeaderFilter();
    }

}
