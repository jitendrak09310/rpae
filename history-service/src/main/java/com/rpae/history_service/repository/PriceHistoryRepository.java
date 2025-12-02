package com.rpae.history_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rpae.history_service.model.PriceHistory;

public interface PriceHistoryRepository extends JpaRepository<PriceHistory, Long> {

}
