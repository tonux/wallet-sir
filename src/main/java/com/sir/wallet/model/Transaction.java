package com.sir.wallet.model;

import jakarta.persistence.*;


@Entity
public class Transaction {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;

    @ManyToOne
    private Wallet wallet;

    private long amount;
    private String type;

    // Constructors, getters, and setters
}
