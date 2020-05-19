package com.youngcarl.consumer.api.service;


import com.youngcarl.common.pojo.ResponseModel;
import com.youngcarl.consumer.api.service.Impl.ApiHystriServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Service
@FeignClient(value = "yc-provider-server", fallback = ApiHystriServiceImpl.class)
public interface ApiService {

    @RequestMapping("/hi")
    ResponseModel home(@RequestParam(value = "name", defaultValue = "this is default value") String name);

}
