package com.iwonker.service;

import com.iwonker.TestServiceApi;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Value;

/** @author wcq
* @Description
* @Date 2020-04-09 14:40:28
* @Param
* @return
**/
@Service
public class TestServiceApiImp implements TestServiceApi {

    @Value("${server.port}")
    private Integer port;

    @Override
    public String demo() {
        return "provider server port= "+ port;
    }
}
