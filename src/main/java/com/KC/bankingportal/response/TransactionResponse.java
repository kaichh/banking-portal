package com.KC.bankingportal.response;
import java.math.BigDecimal;
import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;

// reponse for client's query
@Data
@AllArgsConstructor
public class TransactionResponse {
    private Long accountId;

    private Long transactionId;

    private BigDecimal amount;

    //private String currency;

    private LocalDate valueDate;
}
