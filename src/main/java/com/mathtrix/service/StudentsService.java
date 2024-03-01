package com.mathtrix.service;

import com.mathtrix.entity.Students;
import com.mathtrix.repository.StudentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

@Service
public class StudentsService {
    @Autowired
    private StudentsRepository studentsRepository;

    public Students saveStudents(Students students) {
        studentsRepository.save(students);
        return students;
    }
    public Collection<Students> findStudensByName(String name){
        return studentsRepository.findByName(name);
    }
    public List<Students> findAllStudents() {
        return studentsRepository.findAll();
    }
}
