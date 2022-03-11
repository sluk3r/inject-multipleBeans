package com.jd.brick.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;


@Slf4j
@Component
public class OrderService {

    public String echo() {
        log.info("saveOrder_invoked");
        log.info("about to exit");
        return "echo_result";
    }

}
