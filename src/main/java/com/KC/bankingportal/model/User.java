package com.KC.bankingportal.model;

import lombok.*;

import javax.persistence.*;
import java.util.List;


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
    

    // Create one-to-many relationship with Account
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Account> accounts;
    


}
