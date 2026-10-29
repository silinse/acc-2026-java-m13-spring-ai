package com.accenture.springai_bootcamp_demo.dto;

import jakarta.validation.constraints.NotBlank;

public record CodeReviewRequest(
        @NotBlank String code
) {
}