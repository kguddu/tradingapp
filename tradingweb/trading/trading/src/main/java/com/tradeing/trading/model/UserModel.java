package com.tradeing.trading.model;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "users")
public class UserModel {
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
     @Column(unique = true)
    private String email;
    private  String password;
    private String roles;
}
