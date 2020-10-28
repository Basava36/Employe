package com.org.svu.controller;

import com.org.svu.model.Student;
import com.org.svu.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    StudentRepo studentRepo;

    @PostMapping("/create")
    public void create(@RequestBody Student student) {

        studentRepo.save(student);
    }

    @GetMapping("/get")
    public List<Student> get() {

        return studentRepo.findAll();
    }

    @PutMapping("/update")
    public void update(@RequestBody Student student) {

        studentRepo.save(student);
    }

    @DeleteMapping("/delete/{studentId}")
    public void delete(@PathVariable Integer studentId) {
            studentRepo.deleteByStudentId(studentId);
    }
}
