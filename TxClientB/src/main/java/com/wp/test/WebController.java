package com.wp.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: wp
 * @Title: WebController
 * @Description: TODO
 * @date 2019/9/16 14:47
 */
@RestController
public class WebController {
    @Autowired
    TxService service;

    @GetMapping("tx")
    public String tc(){
        return service.tx();
    }
}
