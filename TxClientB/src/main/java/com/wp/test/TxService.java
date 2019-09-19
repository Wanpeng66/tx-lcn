package com.wp.test;

import com.codingapi.txlcn.tc.annotation.TxcTransaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author: wp
 * @Title: TxService
 * @Description: TODO
 * @date 2019/9/16 14:48
 */
@Service
public class TxService {

    @Autowired
    JdbcTemplate template;

    @TxcTransaction
    @Transactional
    public String tx(){
        template.execute( "INSERT INTO `itoken-service-admin`.`t_logger`(`id`, `group_id`, `unit_id`, `tag`, `content`, `create_time`, `app_name`) VALUES (6, '1', '1', '1', '1', '1', '1') " );
        int i = 1/0;
        return "success";
    }
}
