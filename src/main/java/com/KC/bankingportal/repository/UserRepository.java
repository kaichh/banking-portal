package com.KC.bankingportal.repository;

import com.KC.bankingportal.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}

