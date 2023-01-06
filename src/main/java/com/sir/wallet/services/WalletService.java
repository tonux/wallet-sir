package com.sir.wallet.services;

import com.sir.wallet.model.Wallet;

public interface WalletService {

    Wallet getWalletById(Long id);

    Wallet saveWallet(Wallet wallet);

    Wallet updateWallet(Long id, Wallet wallet);

    void deleteWallet(Wallet wallet);

    Iterable<Wallet> getAllWallets();
}
