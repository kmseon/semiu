package com.semiuniv.semiu.service;

import com.semiuniv.semiu.entity.Student;
import com.semiuniv.semiu.entity.Subject;
import com.semiuniv.semiu.repository.SubjectRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubjectService {
    private final SubjectRepository subjectRepository;

    public SubjectService(SubjectRepository subjectRepository) {
        this.subjectRepository = subjectRepository;
    }

    public List<Subject> showSubject() {
        return subjectRepository.findAll();
    }
}
