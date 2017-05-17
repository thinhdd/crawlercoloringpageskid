package com.specialpoint.crawlercoloringpageskid.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by thinhdd
 * Date 5/17/2017.
 */
@RestController
public class CrawlerController {
    @Autowired

    @GetMapping("/getAllData")
    public void getAllData(){
        String url = "http://www.coloringpageskid.com";

    }
}
