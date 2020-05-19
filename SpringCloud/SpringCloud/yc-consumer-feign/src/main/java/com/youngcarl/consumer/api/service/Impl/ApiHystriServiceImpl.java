package com.youngcarl.consumer.api.service.Impl;

import com.youngcarl.common.pojo.ResponseModel;
import com.youngcarl.consumer.api.service.ApiService;
import org.springframework.stereotype.Component;

@Component
public class ApiHystriServiceImpl implements ApiService {

    @Override
    public ResponseModel home(String name) {
        return ResponseModel.faild("服务异常，请联系管理员");
    }

}
