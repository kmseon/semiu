package com.semiuniv.semiu.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.Date;

import static jakarta.persistence.FetchType.LAZY;

@Entity
@Data
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "student_id")
    private Integer id;

    @Column(name = "student_name", length = 30)
    private String name;

    private Date birth;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    @Column(length = 100)
    private String address;

    @Column(length = 13)
    private String phone;

    @OneToOne(fetch = LAZY)
    @JoinColumn(name = "dept_id")
    private Department department;

    @Column(name = "academic_year")
    private Integer academicYear;

    private Integer semester;

    @Column(name = "entrance_date")
    private Date entranceDate;

    @Column(name = "graduation_date", nullable = true)
    private Date graduationDate;
}
