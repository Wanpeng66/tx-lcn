package com.wp.test;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author: wp
 * @Title: TxClient
 * @Description: TODO
 * @date 2019/9/16 14:00
 */
@FeignClient("txClientB")
public interface TxClient {

    @GetMapping("tx")
    public String tx();
}
