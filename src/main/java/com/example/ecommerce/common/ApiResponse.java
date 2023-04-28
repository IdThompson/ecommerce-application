package com.example.ecommerce.common;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Data
public class ApiResponse {
    private final Boolean success;
    private final String message;
}
