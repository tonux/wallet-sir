package com.sir.wallet.services;

import com.sir.wallet.model.Transaction;
import org.springframework.stereotype.Service;

@Service
public class TransactionServiceImpl implements TransactionService {

    @Override
    public Transaction createTransaction(Transaction transaction) {
        return null;
    }

    @Override
    public Transaction getTransactionById(Long id) {
        return null;
    }

    @Override
    public Transaction updateTransaction(Transaction transaction) {
        return null;
    }

    @Override
    public void deleteTransaction(Transaction transaction) {

    }

    @Override
    public Iterable<Transaction> getAllTransactions() {
        return null;
    }
}
