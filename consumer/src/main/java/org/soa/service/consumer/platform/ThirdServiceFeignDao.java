package org.soa.service.consumer.platform;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by frodo on 2017/8/7.
 */
@FeignClient(value = "soa-provider-service", fallback = ThirdServiceFeignDao.Fallback.class)
public interface ThirdServiceFeignDao {

    @RequestMapping(method = RequestMethod.GET, value = "/soaproviderservice/serviceInstances/{applicationName}")
    String serviceInstance(@PathVariable("applicationName") String applicationName);

    class Fallback implements ThirdServiceFeignDao {

        @Override
        public String serviceInstance(@PathVariable("applicationName") String applicationName) {
            return "服务不见了，稍候再试！";
        }
    }
}
