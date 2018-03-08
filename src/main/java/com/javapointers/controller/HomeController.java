package com.javapointers.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Jerry Conde, webmaster@javapointers.com
 * @since 8/9/2016
 */
@Controller
public class HomeController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
    @RequestMapping("/test")
    public String viewHome() {
    	
    	//logger.debug("Welcome {}", "testing");
    	logger.info("Welcome22 {}", "testing22");
        return "index";
    }
}
