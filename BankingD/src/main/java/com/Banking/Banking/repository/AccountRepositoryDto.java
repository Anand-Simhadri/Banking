package com.Banking.Banking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Banking.Banking.entity.AccountDetails;

public interface AccountRepositoryDto extends JpaRepository<AccountDetails, Long>{

	AccountDetails findByAccountNumberEquals(Long fromAccountNumber);

}

