package com.rpae.source_service.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rpae.source_service.model.Source;

public interface SourceRepository extends JpaRepository<Source, Long> {
	Optional<Source> findBySourceName(String sourceName);

}
