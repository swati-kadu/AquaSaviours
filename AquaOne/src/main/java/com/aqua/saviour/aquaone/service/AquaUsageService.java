package com.aqua.saviour.aquaone.service;

import com.aqua.saviour.aquaone.request.AquaUsageRequest;
import com.aqua.saviour.aquaone.response.AquaUsageResponse;

public interface AquaUsageService {
    public String addUsage(AquaUsageRequest request);
    public AquaUsageResponse getUsage(String houseId);
}
