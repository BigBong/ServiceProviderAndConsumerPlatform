package org.soa.service.consumer.platform;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by frodo on 2017/8/7.
 */
@RestController
public class ConsumerController {
    @Autowired
    private ThirdServiceFeignDao thirdServiceFeignDao;

    @GetMapping("/consumer/serviceInstances/{applicationName}")
    public String findServiceInstancesByApplicationName(@PathVariable String applicationName) {
        return thirdServiceFeignDao.serviceInstance(applicationName);
    }
}
