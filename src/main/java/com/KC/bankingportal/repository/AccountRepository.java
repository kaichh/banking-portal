package com.KC.bankingportal.repository;

import com.KC.bankingportal.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {
    Account findByidEquals(Long accountId);
}
