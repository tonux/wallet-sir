package com.sir.wallet.services;

import com.sir.wallet.model.Transaction;

public interface TransactionService {

    Transaction createTransaction(Transaction transaction );

    Transaction getTransactionById(Long id);

    Transaction updateTransaction(Transaction transaction);

    void deleteTransaction(Transaction transaction);

    Iterable<Transaction> getAllTransactions();
}
