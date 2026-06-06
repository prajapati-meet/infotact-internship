package com.payment.ledger;

import java.util.UUID;

import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WalletRepository extends JpaRepository<Wallet,UUID>{
	
	optional<Wallet> findByUser(User user);
	
	optional<Wallet> findByUserId(UUID userId);
	
	
	

}
