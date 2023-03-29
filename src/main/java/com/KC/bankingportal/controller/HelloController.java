package com.KC.bankingportal.controller;
import com.KC.bankingportal.model.Account;
import com.KC.bankingportal.model.User;

import com.KC.bankingportal.repository.AccountRepository;
import com.KC.bankingportal.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

@RestController
@RequestMapping("api/")
public class HelloController {
    @Autowired // This means to get the bean called userRepository
    // Which is auto-generated by Spring, we will use it to handle the data
    private UserRepository userRepository;
    @Autowired
    private AccountRepository accountRepository;


    @GetMapping("/hello")
    public String getHello() {
        return "hello";
    }

    @PostMapping(path="/adduser") // Map ONLY POST Requests
    public @ResponseBody String addNewUser (@RequestParam String name
            , @RequestParam String email) {
        // @ResponseBody means the returned String is the response, not a view name
        // @RequestParam means it is a parameter from the GET or POST request

        User n = new User();
        n.setName(name);
        n.setEmail(email);
        userRepository.save(n);
        return "Saved";
    }

    @GetMapping(path="/allusers")
    public @ResponseBody Iterable<User> getAllUsers() {
        // This returns a JSON or XML with the users
        return userRepository.findAll();
    }

    @PostMapping(path="/addaccount") // Map ONLY POST Requests
    public @ResponseBody String addNewAccount (@RequestParam String name
            , @RequestParam String iban, @RequestParam String currency
            , @RequestParam BigDecimal balance) {


        Account n = new Account();
        n.setIban(iban);
        n.setCurrency(currency);
        n.setBalance(balance);
        accountRepository.save(n);
        return "Saved";
    }

    @GetMapping(path="/allaccount")
    public @ResponseBody Iterable<Account> getAllAccounts() {
        // This returns a JSON or XML with the users
        return accountRepository.findAll();
    }

}
