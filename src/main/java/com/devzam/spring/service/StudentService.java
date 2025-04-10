package com.devzam.spring.service;

import com.devzam.spring.StudentInterface;
import com.devzam.spring.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService  {
    List<Student> studentList = new ArrayList<>();
    public StudentService(){
        studentList.add(new Student(1,"zain", 302,"jhang"));
        studentList.add(new Student(2,"ali",30454,"lhr"));
        studentList.add(new Student(3,"zam",303737,"fsd"));
        studentList.add(new Student(4,"zain", 302,"jhang"));
        studentList.add(new Student(5,"ali",30454,"lhr"));
        studentList.add(new Student(6,"zam",303737,"fsd"));
        studentList.add(new Student(7,"zain", 302,"jhang"));
        studentList.add(new Student(8,"ali",30454,"lhr"));
        studentList.add(new Student(9,"zam",303737,"fsd"));
        studentList.add(new Student(10,"zain", 302,"jhang"));
        studentList.add(new Student(11,"ali",30454,"lhr"));
        studentList.add(new Student(12,"zam",303737,"fsd"));
    }

    public List<Student> getData(int page) {
        int sizeperpage=5;
        int start=(page-1)*sizeperpage;
        int end=start+sizeperpage;
        if(start>=studentList.size()){
            return new ArrayList<>();
        }
        if(end>studentList.size()){
            end = studentList.size();
        }
        return studentList.subList(start,end);
    }


    public Student addData() {
        return null;
    }


    public Student userData() {
        return null;
    }
}
