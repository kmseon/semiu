package com.semiuniv.semiu.repository;

import com.semiuniv.semiu.entity.Student;
import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class StudentRepository {

    private final EntityManager em;

    public List<Student> findAll() {
        return em.createQuery("select s from Student s", Student.class)
                .getResultList();
    }
}
