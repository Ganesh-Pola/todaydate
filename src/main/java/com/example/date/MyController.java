package com.example.date; 

import org.springframework.web.bind.annotation.RestController; 
import org.springframework.web.bind.annotation.GetMapping; 

import java.time.*; 
import java.time.format.*; 

@RestController 

public class MyController {

    @GetMapping("/") 

    public String date() {
        LocalDate date = LocalDate.now(); 
        DateTimeFormatter dt = DateTimeFormatter.ofPattern("dd-MM-yyyy"); 
        String now = dt.format(date); 
        return now;
    }
}