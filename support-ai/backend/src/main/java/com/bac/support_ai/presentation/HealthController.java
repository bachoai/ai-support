package com.bac.support_ai.presentation;

import com.bac.support_ai.application.HealthService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.bac.support_ai.shared.dto.GreetingRequest;
import com.bac.support_ai.shared.dto.GreetingResponse;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/api")
public class HealthController {

    private final HealthService healthService;

    public HealthController(HealthService healthService) {
        this.healthService = healthService;
    }

    @GetMapping("/health")
    public String health() {
        return healthService.getHealthMessage();
    }
    @PostMapping("/greeting")
public GreetingResponse greeting(
        @Valid @RequestBody GreetingRequest request
) {
    String message = healthService.greeting(request.getName());

    return new GreetingResponse(message);
}
}
