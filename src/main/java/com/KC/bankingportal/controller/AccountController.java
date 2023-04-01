package com.KC.bankingportal.controller;

import com.KC.bankingportal.request.TransactionRequest;
import com.KC.bankingportal.response.TransactionResponse;
import com.KC.bankingportal.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/account")
public class AccountController {
    @Autowired
    private AccountService accountService;
    @PostMapping(path="/transaction") // Map ONLY POST Requests
    public @ResponseBody List<TransactionResponse> getTransaction (@RequestBody TransactionRequest request) {
        List<TransactionResponse> responseList = accountService.getTransactionPage(request);
        return responseList;
    }
}
