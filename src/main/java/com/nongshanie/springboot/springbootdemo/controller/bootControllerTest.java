package com.nongshanie.springboot.springbootdemo.controller;

import com.nongshanie.springboot.springbootdemo.dao.mapper.SrCreditMapper;
import com.nongshanie.springboot.springbootdemo.dao.model.SrCredit;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(description = "demo")
@RestController
@RequestMapping(value = "/hello")
public class bootControllerTest {

    @Autowired
    SrCreditMapper srCreditMapper;
        @ApiOperation(value = "hello",notes = "hello")
        @RequestMapping("/hello")
        public String index(){
            SrCredit srCredit = srCreditMapper.selectByPrimaryKey(96);
            System.out.println("output:>>>" + "进入controller");
            //return "Hey,Judy";
            return srCredit.toString();
        }

}
