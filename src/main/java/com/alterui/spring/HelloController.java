package com.alterui.spring;

import org.apache.juli.logging.LogFactory;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.slf4j.Logger;
/**
 * @author liurui
 * @time 2019-07-04 11:10
 */

@Controller

public class HelloController {

    @Value("${person.name}")
    private String name;

    @ResponseBody
    @RequestMapping("/hello")
    public String index() {
        Logger logger = LoggerFactory.getLogger(HelloController.class);
        logger.info("controller  ------->  ");
        return "person name="+name;
    }



}
