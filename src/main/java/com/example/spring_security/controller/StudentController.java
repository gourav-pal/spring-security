package com.example.spring_security.controller;


import com.example.spring_security.model.Students;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    List<Students>students=new ArrayList<>(List.of(
            new Students("Navin", 1, "java"),
            new Students("John", 2, "react")
    ));

    @GetMapping("students")
    public List<Students>getStudents(){
        return students;
    }

    @PostMapping("students")
    public void addStudent(@RequestBody Students student){
        students.add(student);
    }


    @GetMapping("/home")
    public String getDetails(HttpServletRequest http){
        return "Hello  "+ http.getSession().getId();
    }

    @GetMapping("/getToken")
    public CsrfToken getToken(HttpServletRequest request){
        return (CsrfToken) request.getAttribute("_csrf");
    }
}
