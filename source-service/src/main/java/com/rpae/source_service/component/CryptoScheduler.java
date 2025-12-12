package com.rpae.source_service.component;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.rpae.common_lib.common.Constants;
import com.rpae.source_service.service.SourceService;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class CryptoScheduler {

	private final SourceService service;

	@Scheduled(cron = "0 0 */6 * * *")
	public void runEverySixHours() {
		String url = String.format(Constants.CRYPTO_API_URL, Constants.INR);
		service.getAllCryptoCoins(url);
		System.out.println("Crypto data fetched in async thread: " + Thread.currentThread().getName());
	}

}
