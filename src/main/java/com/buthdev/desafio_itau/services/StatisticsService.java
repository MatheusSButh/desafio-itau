package com.buthdev.desafio_itau.services;

import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.buthdev.desafio_itau.model.Statistics;
import com.buthdev.desafio_itau.model.Transaction;

@Service
public class StatisticsService {
	
	@Autowired
	private TransactionService transactionService;
	
	public Statistics getStatistcs() {
	OffsetDateTime last60s = OffsetDateTime.now(ZoneOffset.UTC).minusSeconds(60);
	
	List<Transaction> recentTransactions = transactionService.getAllTransactions().stream().
			filter(x -> x.getDateHour().isAfter(last60s)).collect(Collectors.toList());

	DoubleSummaryStatistics stats = recentTransactions.stream().collect(Collectors.summarizingDouble(Transaction :: getValue));
	
	return new Statistics(stats.getCount(), stats.getSum(), stats.getAverage(), stats.getMin(), stats.getMax());
   }
}
