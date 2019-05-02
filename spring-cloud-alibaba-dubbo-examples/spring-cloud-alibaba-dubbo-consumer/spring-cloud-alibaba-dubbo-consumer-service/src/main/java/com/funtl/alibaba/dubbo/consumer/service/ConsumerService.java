package com.funtl.alibaba.dubbo.consumer.service;

import org.springframework.cloud.openfeign.FeignClient;

/**
 * 标记 @FeignClient("consumer") 注解，空接口不做任何接口定义
 */
@FeignClient("consumer")
public interface ConsumerService {
}
