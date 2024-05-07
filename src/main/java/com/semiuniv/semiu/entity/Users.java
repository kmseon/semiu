package com.semiuniv.semiu.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Users {

    @Id
    @Column(name = "user_id")
    private Integer id;

    @Column(length = 100)
    private String password;

    @Enumerated(EnumType.STRING)
    private UserRole role;
}
