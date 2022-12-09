package com.posidex.lic.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.posidex.lic.entity.DetailsEntity;

@Repository
public interface SearchRepository extends JpaRepository<DetailsEntity, Integer> {
	// public DetailsEntity findbyAll()
}
