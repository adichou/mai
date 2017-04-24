package com.adichou.iam.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ADICHOU on 2017/4/23.
 */
@RestController
@EnableAutoConfiguration
public class MasterController {

    @RequestMapping("/")
    @ResponseBody
    public String homePage() {
        return "Hello World";
    }
}
