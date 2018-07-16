package com.vivo.web;

import org.springframework.cloud.netflix.feign.FeignClient;

@FeignClient(value = "HELLO-SERVICE")
public interface RefactorHelloService extends com.vivo.service.HelloService {


}