package com.buthdev.desafio_itau.services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Service;

import com.buthdev.desafio_itau.model.Transaction;

@Service
public class TransactionService {
	
	private List<Transaction> list = new ArrayList<>();
	
	public void createTransaction(Transaction transaction) {
		list.add(transaction);
	}
	
	public void clearTransactions() {
		list.clear();
	}
	
	public List<Transaction> getAllTransactions() {
        return Collections.unmodifiableList(list); 
    }
}
