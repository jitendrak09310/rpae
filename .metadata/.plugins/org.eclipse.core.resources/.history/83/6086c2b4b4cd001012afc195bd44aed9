package com.rpae.alert_service.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.rpae.alert_service.model.Alert;
import com.rpae.alert_service.model.PriceDTO;
import com.rpae.alert_service.repository.AlertRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@RequiredArgsConstructor
public class AlertService {

	private final AlertRepository repo;

	public void checkAlerts(PriceDTO priceDto) {
		List<Alert> alerts = repo.findByActiveTrue();

		for (Alert alert : alerts) {
			if (!alert.getSymbol().equalsIgnoreCase(priceDto.getSymbol())) {
				continue;
			}

			Double price = priceDto.getPrice();

			if (price == null)
				continue;

			if (alert.getUpperLimit() != null && price > alert.getUpperLimit()) {
				log.info("🔥 ALERT! {} crossed upper limit {}", alert.getSymbol(), alert.getUpperLimit());
			}

			// Check lower limit
			if (alert.getLowerLimit() != null && price < alert.getLowerLimit()) {
				log.info("⚠ ALERT! {} dropped below {}", alert.getSymbol(), alert.getLowerLimit());
			}
		}

	}
	
	public Alert createAlert(Alert alert) {
	    return repo.save(alert);
	}

	public List<Alert> getAll() {
	    return repo.findAll();
	}

}
