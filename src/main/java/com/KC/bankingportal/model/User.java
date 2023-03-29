package com.KC.bankingportal.model;

import lombok.*;

import javax.persistence.*;


@Entity
@Table
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;




}
