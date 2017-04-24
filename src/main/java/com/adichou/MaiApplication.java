package com.adichou;

import com.adichou.iam.controller.MasterController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MaiApplication {


    public static void main(String[] args) {
        SpringApplication.run(MasterController.class, args);
    }
}
