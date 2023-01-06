package com.sir.wallet.services;

import com.sir.wallet.model.Wallet;
import org.springframework.stereotype.Service;

@Service
public class WalletServiceImpl implements WalletService {

    @Override
    public Wallet getWalletById(Long id) {
        return null;
    }

    @Override
    public Wallet saveWallet(Wallet wallet) {
        return null;
    }

    @Override
    public Wallet updateWallet(Long id, Wallet wallet) {
        return null;
    }

    @Override
    public void deleteWallet(Wallet wallet) {

    }

    @Override
    public Iterable<Wallet> getAllWallets() {
        return null;
    }
}
