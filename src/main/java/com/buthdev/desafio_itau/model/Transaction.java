package com.buthdev.desafio_itau.model;

import java.time.OffsetDateTime;
import java.util.Objects;

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

	@Override
	public int hashCode() {
		return Objects.hash(dateHour, value);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Transaction other = (Transaction) obj;
		return Objects.equals(dateHour, other.dateHour) && Objects.equals(value, other.value);
	}
}
