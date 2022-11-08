package com.springspark.wordcount.controller;

import com.springspark.wordcount.service.WordCountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

@RestController
public class WordCountController {

    @Autowired
    WordCountService service;

    //Tutorial error: should be GET not POST
    //Tutorial error: escaping \ not working, use comma instead
    @RequestMapping(method = RequestMethod.GET, path = "/wordcount")
    public Map<String, Long> count(@RequestParam(required = true) String words) {
        List<String> wordList = Arrays.asList(words.split(","));
        return service.getCount(wordList);
    }
}