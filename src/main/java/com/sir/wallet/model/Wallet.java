package com.sir.wallet.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Wallet {

    @Id
    private long id;
    private String name;
    private long balance;

    // Constructors, getters, and setters
}
