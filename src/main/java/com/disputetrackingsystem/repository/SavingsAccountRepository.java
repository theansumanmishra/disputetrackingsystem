package com.disputetrackingsystem.repository;

import com.disputetrackingsystem.model.SavingsAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SavingsAccountRepository extends JpaRepository <SavingsAccount, Long> {
}
