package com.mathtrix.controller;

import com.mathtrix.entity.Students;
import com.mathtrix.service.StudentsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Slf4j
@RestController
@RequestMapping(path = "/api/v2")
public class StudentController {
    @Autowired
    private StudentsService studentsService;

    @PostMapping(path = "/student/admission")
    public ResponseEntity<Students> addStudent(@RequestBody Students students) {
        students.setTimeOfAdmission(new Date());
        Students student = studentsService.saveStudents(students);
        return new ResponseEntity<>(student, HttpStatus.OK);
    }

    @GetMapping(path = "/students")
    public ResponseEntity<Collection<Students>> findStudentByName(@RequestParam String name) {
        log.info("Name is : " + name);
        return new ResponseEntity<>(studentsService.findStudensByName(name), HttpStatus.OK);
    }


    @GetMapping(path = "/students/details")
    public ResponseEntity<List<Students>> studentsDetails() {
        return new ResponseEntity<>(studentsService.findAllStudents(), HttpStatus.OK);
    }
}
