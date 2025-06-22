package com.example.spring_security;


import com.example.spring_security.model.Students;
import jakarta.servlet.http.HttpServlet;
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
    public String getDetails(){
        return "Hello";
    }

    @GetMapping("/getToken")
    public CsrfToken getToken(HttpServletRequest request){
        return (CsrfToken) request.getAttribute("_csrf");
    }
}
