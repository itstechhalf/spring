package com.devzam.spring;

import com.devzam.spring.model.Student;
import com.devzam.spring.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MyController {
    StudentService studentService = new StudentService();
//    MyController(StudentService studentService){
//        this.studentService=studentService;
//    }

    @GetMapping("/")
    public String home(){
        return "Your Server Running";
    }

    @GetMapping("/getData")
    public List<Student> getData(@RequestParam(defaultValue = "1") int page){
        return this.studentService.getData(page);
    }
}
