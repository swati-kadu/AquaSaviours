package com.aqua.saviour.aquaone.service.impl;

import com.aqua.saviour.aquaone.constants.AquaSaviourConstants;
import com.aqua.saviour.aquaone.entity.HouseUsage;
import com.aqua.saviour.aquaone.repository.AquaUsageRepository;
import com.aqua.saviour.aquaone.request.AquaUsageRequest;
import com.aqua.saviour.aquaone.response.AquaUsageResponse;
import com.aqua.saviour.aquaone.service.AquaUsageService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AquaUsageServiceImpl implements AquaUsageService {

    @Autowired
    AquaUsageRepository repository;

    @Override
    public String addUsage(AquaUsageRequest request) {
        HouseUsage usage = new HouseUsage();
        BeanUtils.copyProperties(usage, request);
        usage = repository.save(usage);
        if (usage != null) {
            return AquaSaviourConstants.USAGE_ADD_SUCCESS_MSG + " " + request.getHouseId();
        } else {
            return AquaSaviourConstants.USAGE_ADD_FAILURE_MSG + " " + request.getHouseId();
        }
    }

    @Override
    public AquaUsageResponse getUsage(String houseId) {
        AquaUsageResponse response = new AquaUsageResponse();
        Optional<HouseUsage> usage = repository.findById(houseId);
        if (usage.isPresent()) {
            BeanUtils.copyProperties(usage.get(), response);
        }
        return response;
    }
}
