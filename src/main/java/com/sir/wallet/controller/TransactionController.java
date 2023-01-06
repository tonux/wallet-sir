package com.sir.wallet.controller;

import com.sir.wallet.model.Transaction;
import com.sir.wallet.services.TransactionService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/transaction")
public class TransactionController {
    private final TransactionService transactionService;

    public TransactionController(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    @PostMapping("/transactions")
    public Transaction createTransaction(@RequestBody Transaction transaction) {
        return transactionService.createTransaction(transaction);
    }

    @GetMapping("/transactions")
    public Iterable<Transaction> getAllTransactions() {
        return transactionService.getAllTransactions();
    }
}
