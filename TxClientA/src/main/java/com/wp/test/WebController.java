package com.wp.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: wp
 * @Title: WebController
 * @Description: TODO
 * @date 2019/9/16 13:59
 */
@RestController
public class WebController {



    @Autowired
    TxService service;


    @GetMapping("testTx")
    public String tx(){

        return service.tx();
    }
}
