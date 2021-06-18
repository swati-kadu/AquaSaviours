package com.aqua.saviour.aquaone.repository;

import com.aqua.saviour.aquaone.entity.HouseUsage;
import org.springframework.data.repository.CrudRepository;

public interface AquaUsageRepository extends CrudRepository<HouseUsage, String> {
}

