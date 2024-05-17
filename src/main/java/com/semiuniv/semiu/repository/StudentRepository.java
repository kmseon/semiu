package com.semiuniv.semiu.repository;

import com.semiuniv.semiu.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
<<<<<<< HEAD
public interface StudentRepository extends JpaRepository<Student, Integer> {
=======
public interface StudentRepository extends JpaRepository<Student, String> {
>>>>>>> origin/kmseon
}
