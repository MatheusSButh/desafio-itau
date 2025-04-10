package com.buthdev.desafio_itau.model;

import java.time.OffsetDateTime;

public class Transaction {
	
	private Double value;
	private OffsetDateTime dateHour;
	
	public Transaction() {
	}

	public Transaction(Double value, OffsetDateTime dateHour) {
		super();
		this.value = value;
		this.dateHour = dateHour;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}

	public OffsetDateTime getDateHour() {
		return dateHour;
	}

	public void setDateHour(OffsetDateTime dateHour) {
		this.dateHour = dateHour;
	}
}
