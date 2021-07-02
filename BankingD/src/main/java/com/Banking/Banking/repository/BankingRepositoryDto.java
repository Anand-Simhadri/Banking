package com.Banking.Banking.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.Banking.Banking.entity.CustomerDetails;



public interface BankingRepositoryDto extends JpaRepository<CustomerDetails, Long>{

	CustomerDetails findByUserNameAndPassword(String userName, String password);

}
