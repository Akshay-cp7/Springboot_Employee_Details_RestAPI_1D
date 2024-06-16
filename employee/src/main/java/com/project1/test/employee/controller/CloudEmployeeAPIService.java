package com.project1.test.employee.controller;

import com.project1.test.employee.model.CloudEmployee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cloudemployee")

public class CloudEmployeeAPIService {
    @GetMapping("{employeeId}")
    public CloudEmployee getCloudEmployeeDetails(String employeeId){
        return new CloudEmployee("E1","Arun",3000,"sales");


    }
}
