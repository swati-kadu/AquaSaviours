package com.aqua.saviour.aquaone.controller;

import com.aqua.saviour.aquaone.request.AquaUsageRequest;
import com.aqua.saviour.aquaone.response.AquaUsageResponse;
import com.aqua.saviour.aquaone.service.AquaUsageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/aqua-saviour/v1")
public class AquaUsageController {

    @Autowired
    private AquaUsageService aquaUsageService;

    @RequestMapping(value = "/usage", method = RequestMethod.POST)
    public String addUsage(@RequestBody AquaUsageRequest request) {
        return aquaUsageService.addUsage(request);
    }

    @RequestMapping(value = "/usage/{houseId}", method = RequestMethod.POST)
    public AquaUsageResponse getUsage(@PathVariable("houseId") String houseId) {
        return aquaUsageService.getUsage(houseId);
    }
}
