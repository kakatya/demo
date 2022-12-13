package com.example.demo.controller;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    static final Logger log = LogManager.getLogger(MainController.class);

    @GetMapping("/main")
    public String getMain(@RequestParam String param) {
        log.info(param);
        return param;
    }
}
