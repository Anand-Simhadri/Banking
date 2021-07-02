package com.Banking.Banking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Banking.Banking.entity.AccountDetails;
import com.Banking.Banking.entity.CustomerDetails;
import com.Banking.Banking.entity.FundTransferRequest;
import com.Banking.Banking.model.Customer;
import com.Banking.Banking.model.FundRequest;
import com.Banking.Banking.model.LoginRequest;
import com.Banking.Banking.model.SuccessResponse;
import com.Banking.Banking.service.BankingService;

@RestController
@RequestMapping("api")
public class Bankingcontroller {

	@Autowired
	private BankingService bankingService;

	@PostMapping("/product/createaccount")
	public ResponseEntity<AccountDetails> createAccount(@RequestBody Customer customerDetails) {
		if (customerDetails.getAge() > 18) {
			AccountDetails accountDetails = bankingService.createBankingUser(new CustomerDetails(null,
					customerDetails.getAddress(), customerDetails.getAge(), customerDetails.getEmailId(),
					customerDetails.getFirstName(), customerDetails.getGender(), customerDetails.getLastName(),
					customerDetails.getPanNumber(), customerDetails.getPhoneNumber(), customerDetails.getUserName(),
					customerDetails.getPassword()));
			return new ResponseEntity<>(accountDetails, HttpStatus.CREATED);
		} else {
			return new ResponseEntity<>(new AccountDetails(), HttpStatus.BAD_REQUEST);
		}
	}

	@PostMapping("/product/transferamount")
	public ResponseEntity<FundTransferRequest> transferAmount(@RequestBody FundRequest fundTransferRequest) {
		FundTransferRequest request = bankingService.transferMoney(
				new FundTransferRequest(fundTransferRequest.getAmount(), fundTransferRequest.getFromAccount(),
						fundTransferRequest.getToAccount(), null, fundTransferRequest.getType()));
		return new ResponseEntity<>(request, HttpStatus.OK);
	}

	@GetMapping("/accounthistory/{accountnumber}")
	public ResponseEntity<List<FundTransferRequest>> accountHistory(@PathVariable Long accountnumber) {
		List<FundTransferRequest> accountHistory = bankingService.getAccountHistory(accountnumber);
		return new ResponseEntity<>(accountHistory, HttpStatus.OK);
	}

	@PostMapping("/login")
	public ResponseEntity<SuccessResponse> doLogin(@RequestBody LoginRequest loginRequest) {
		return bankingService.checkLogin(loginRequest);
	}

}
