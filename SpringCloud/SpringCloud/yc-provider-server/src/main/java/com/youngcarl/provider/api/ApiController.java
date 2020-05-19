package com.youngcarl.provider.api;


import com.youngcarl.common.pojo.ResponseModel;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    @RequestMapping("/hi")
    public ResponseModel home(@RequestParam(value = "name", defaultValue = "this is default value") String name) {
        return ResponseModel.success(name);
    }

}
