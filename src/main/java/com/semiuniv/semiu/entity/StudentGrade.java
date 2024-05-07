package com.semiuniv.semiu.entity;

import jakarta.persistence.*;
import lombok.Data;

import static jakarta.persistence.FetchType.LAZY;

@Entity
@Data
public class StudentGrade {

    @Id
    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "student_id")
    private Student student;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "subject_id")
    private Subject subject;

    @Enumerated(EnumType.STRING)
    private Grade grade;
}
