package com.accenture.springai_bootcamp_demo.dto;

import java.util.List;

public record CodeReviewResponse(
        String summary,
        List<String> issues,
        List<String> suggestions
) {
}