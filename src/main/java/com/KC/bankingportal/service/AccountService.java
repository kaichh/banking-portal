package com.KC.bankingportal.service;

import com.KC.bankingportal.model.Account;
import com.KC.bankingportal.model.Transaction;
import com.KC.bankingportal.repository.AccountRepository;
import com.KC.bankingportal.repository.TransactionRepository;
import com.KC.bankingportal.request.TransactionRequest;
import com.KC.bankingportal.response.TransactionResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class AccountService {
    @Autowired
    private AccountRepository accountRepository;

    @Autowired
    TransactionRepository transactionRepository;

    public List<TransactionResponse> getTransactionPage(TransactionRequest request) {
        List<TransactionResponse> respList = new ArrayList<TransactionResponse>();
        List<Transaction> transList = transactionRepository.findALLByAccountEquals(request.getAccountId());

        for(Transaction t : transList) {
            respList.add(new TransactionResponse(request.getAccountId(),
                    t.getId(), t.getAmount(), t.getValuedate()));
        }
        return respList;
    }

}
