package com.example.JPAProject01.controller;

import com.example.JPAProject01.entity.Student;
import com.example.JPAProject01.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/std")
public class StudentController {
    @Autowired
   private StudentService service;

    @PostMapping("/save")
    public Student createStudent(@RequestBody Student student) {
       return service.saveStudent(student);
    }
     
     @GetMapping("/all")
    public List<Student> getAllStudents() {
        List<Student> allStudents = service.getAllStudents();
        return allStudents;
    }

    @GetMapping("/{id}")
    public Student getStudentsById(@PathVariable Integer id) {
        return service.getStudentsById(id);
    }

    @PatchMapping("/{id}")
    public Student updateStudent(@PathVariable Integer id,@RequestBody Student student) {
        Student updatedStudent = service.updateStudent(id, student);
        return updatedStudent;
    }

    @DeleteMapping("delete/{id}")
    public Student deleteStudent(@PathVariable Integer id) {
        Student deleteStudent = service.deleteStudent(id);
        return deleteStudent;
    }
}
