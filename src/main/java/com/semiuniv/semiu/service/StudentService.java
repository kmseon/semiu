package com.semiuniv.semiu.service;

import com.semiuniv.semiu.entity.Student;
import com.semiuniv.semiu.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepository studentRepository;

    public List<Student> findStudents() {
        return studentRepository.findAll();
    }
}
