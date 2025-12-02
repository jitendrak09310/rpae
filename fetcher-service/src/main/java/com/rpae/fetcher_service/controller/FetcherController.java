package com.rpae.fetcher_service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rpae.fetcher_service.service.FetcherService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/api/fetcher")
@RequiredArgsConstructor
@Slf4j
public class FetcherController {

	private final FetcherService fetcherService;

	@GetMapping("/testFetch")
	public String testFetch() {
		fetcherService.fetchAll();
		return "fetch Complete";
	}

}
