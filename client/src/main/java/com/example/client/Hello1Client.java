package com.example.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by afa on 10.09.16.
 */
@FeignClient(name = "hello1")
public interface Hello1Client {

    @RequestMapping(method = RequestMethod.GET, value = "/", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    String hello1();

}
