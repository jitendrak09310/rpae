package com.rpae.source_service.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.rpae.source_service.model.Source;
import com.rpae.source_service.repository.SourceRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class SourceService {

	private final SourceRepository repo;

	public List<Source> getAll() {
		return repo.findAll();
	}

	public Source save(Source s) {
		return repo.save(s);
	}

}
