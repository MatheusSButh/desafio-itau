package com.buthdev.desafio_itau.resources;

import java.time.OffsetDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.buthdev.desafio_itau.model.Transaction;
import com.buthdev.desafio_itau.services.TransactionService;

@RestController
@RequestMapping(value = "transacao")
public class TransactionResource {
	
	@Autowired
	TransactionService transactionService;
	
	@PostMapping
	public ResponseEntity<Void> createTransaction(@RequestBody Transaction transaction){
		validateTransaction(transaction);
		
		try {
		transactionService.createTransaction(transaction);
		return ResponseEntity.status(HttpStatus.CREATED).build();
		}
		catch(IllegalArgumentException e) {
			return ResponseEntity.status(HttpStatus.UNPROCESSABLE_ENTITY).build();
		}
	}
	
	
	public void validateTransaction(Transaction transaction) {
		if(transaction.getValue() <= 0 ) {
			throw new IllegalArgumentException("Valor inválido!");
		}
		if(transaction.getDateHour().isAfter(OffsetDateTime.now())) {
			throw new IllegalArgumentException("Data inválida!");
		}
	}
}
