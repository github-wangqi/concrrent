package com.hnmqet.controller;

import com.hnmqet.service.ConcurrentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConcurrentController {

    @Autowired
    private ConcurrentService concurrentService;

    @GetMapping("update/{id}/{count}")
    public void update(@PathVariable("id")Long id ,@PathVariable("count")Double count){
        concurrentService.update(id,count);
    }


}
