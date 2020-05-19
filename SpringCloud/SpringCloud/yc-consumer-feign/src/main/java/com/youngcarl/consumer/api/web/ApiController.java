package com.youngcarl.consumer.api.web;

import com.youngcarl.common.pojo.ResponseModel;
import com.youngcarl.consumer.api.service.ApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    @Autowired
    private ApiService apiService;

    @RequestMapping("/consumerHi")
    public ResponseModel home(@RequestParam(value = "name", defaultValue = "this is default value") String name) {
        return apiService.home(name);
    }


}
