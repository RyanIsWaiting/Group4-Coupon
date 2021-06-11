package com.icbc.group4.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.icbc.group4.Exceptions.ResourceNotFoundException;

@RestController
@RequestMapping("/api")
public class ExceptionController {

//    @GetMapping("/resourceNotFound")
//    public void throwException() {
//        throw new ResourceNotFoundException(null);
//    }
    @GetMapping("/nullPointer")
    public void throwException() {
        throw new ResourceNotFoundException(null);
    }

}
