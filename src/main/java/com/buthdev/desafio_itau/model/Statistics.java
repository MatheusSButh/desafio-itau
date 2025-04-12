package com.buthdev.desafio_itau.model;

public class Statistics {

	private Long count;
	private Double sum;
	private Double avg;
	private Double min;
	private Double max;
	
	public Statistics() {
	}

	public Statistics(Long count, Double sum, Double avg, Double min, Double max) {
		super();
		this.count = count;
		this.sum = sum;
		this.avg = avg;
		this.min = min;
		this.max = max;
	}

	public Long getcount() {
		return count;
	}

	public void setcount(Long count) {
		this.count = count;
	}

	public Double getSum() {
		return sum;
	}

	public void setSum(Double sum) {
		this.sum = sum;
	}

	public Double getAvg() {
		return avg;
	}

	public void setAvg(Double avg) {
		this.avg = avg;
	}

	public Double getMin() {
		return min;
	}

	public void setMin(Double min) {
		this.min = min;
	}

	public Double getMax() {
		return max;
	}

	public void setMax(Double max) {
		this.max = max;
	}
}
