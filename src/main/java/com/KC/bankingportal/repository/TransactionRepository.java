package com.KC.bankingportal.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.KC.bankingportal.model.Transaction;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
    //List<Transaction> findALLByAccountEquals(Long account_id);

    @Query(value="Select * from transaction t where t.accountid = :id"
            , nativeQuery = true)
    List<Transaction> findALLByAccountEquals(@Param("id") Long account_id);
}
