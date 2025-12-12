package com.rpae.user_service.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rpae.user_service.Entity.UserAlertMapping;

public interface UserAlertMappingRepository extends JpaRepository<UserAlertMapping, Long> {
	List<UserAlertMapping> findByUserId(String userId);

}
