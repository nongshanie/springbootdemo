package com.nongshanie.springboot.springbootdemo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(description = "demo")
@RestController
@RequestMapping(value = "/hello")
public class bootControllerTest {


        @ApiOperation(value = "hello",notes = "hello")
        @RequestMapping("/hello")
        public String index(){
            System.out.println("output:>>>" + "进入controller");
            return "Hey,Judy";
        }

}
