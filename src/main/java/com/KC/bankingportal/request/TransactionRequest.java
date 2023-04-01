package com.KC.bankingportal.request;

import lombok.Data;

@Data
public class TransactionRequest {
    private Long accountId;

    private int year;
    private int month;
    private int day;
}
