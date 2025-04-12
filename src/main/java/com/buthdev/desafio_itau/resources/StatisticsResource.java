package com.buthdev.desafio_itau.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.buthdev.desafio_itau.model.Statistics;
import com.buthdev.desafio_itau.services.StatisticsService;

@RestController
@RequestMapping(value = "/estatistica")
public class StatisticsResource {
	
	@Autowired
	StatisticsService statisticsService;
	
	@GetMapping
	public ResponseEntity<Statistics> getStatistics() {
		Statistics stats = statisticsService.getStatistcs();
		return ResponseEntity.status(HttpStatus.OK).body(stats);
	}
}
