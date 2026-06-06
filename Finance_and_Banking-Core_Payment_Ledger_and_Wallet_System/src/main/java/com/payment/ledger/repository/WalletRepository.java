package com.payment.ledger.repository;

import com.payment.ledger.entity.User;
import com.payment.ledger.entity.Wallet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

public interface WalletRepository extends JpaRepository<Wallet,UUID>{
	
	optional<Wallet> findByUser(User user);
	optional<Wallet> findByUserId(UUID userId);

}
