package com.mathtrix.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/api/v1")
public class SampleController {
    @GetMapping(path="/sample/end/point")
    public ResponseEntity<String> sampleEndPoint(){
        return new ResponseEntity<>("Success", HttpStatus.OK);
    }
}
