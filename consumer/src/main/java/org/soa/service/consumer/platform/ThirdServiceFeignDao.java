package org.soa.service.consumer.platform;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by frodo on 2017/8/7.
 */
@FeignClient(value = "soa-provider-service", fallback = ThirdServiceFeignDaoHystrix.class)
public interface ThirdServiceFeignDao {
    @RequestMapping(method = RequestMethod.GET, value = "/soaproviderservice/serviceInstances/soa-provider-service")
    String serviceInstances();
}
