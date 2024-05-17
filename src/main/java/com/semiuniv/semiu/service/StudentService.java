package com.semiuniv.semiu.service;

import com.semiuniv.semiu.entity.Student;
import com.semiuniv.semiu.repository.Student1Repository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class StudentService {

<<<<<<< HEAD
//    private final Student1Repository studentRepository;

    private final StudentRepository studentRepository;
=======
    private final Student1Repository studentRepository;
>>>>>>> origin/kmseon

    public List<Student> findStudents() {
        return studentRepository.findAll();
    }

    public Optional<Student> show_student(Integer loginId) {
        return studentRepository.findById(loginId);
    }

    public Optional<Student> findById(Integer id) {
        return studentRepository.findById(id);
    }
}
