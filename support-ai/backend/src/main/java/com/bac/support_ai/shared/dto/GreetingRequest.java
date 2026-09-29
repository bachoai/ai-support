package com.bac.support_ai.shared.dto;

import jakarta.validation.constraints.NotBlank;

public class GreetingRequest {

    @NotBlank
    private String name;

    public GreetingRequest() {
    }

    public GreetingRequest(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}