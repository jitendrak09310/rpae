package com.rpae.alert_service.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rpae.alert_service.model.Alert;

public interface AlertRepository extends JpaRepository<Alert, Long> {

	List<Alert> findByActiveTrue();

}
