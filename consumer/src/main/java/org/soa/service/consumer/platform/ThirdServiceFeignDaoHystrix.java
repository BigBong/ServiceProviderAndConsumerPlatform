package org.soa.service.consumer.platform;

import org.springframework.stereotype.Component;

/**
 * Created by frodo on 2017/8/7.
 */
@Component
public class ThirdServiceFeignDaoHystrix implements ThirdServiceFeignDao {
    @Override
    public String serviceInstances() {
        return "服务不见了，稍候再试！";
    }
}
