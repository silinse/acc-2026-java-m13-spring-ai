package com.accenture.springai_bootcamp_demo.controller;

import com.accenture.springai_bootcamp_demo.dto.CodeReviewRequest;
import com.accenture.springai_bootcamp_demo.dto.CodeReviewResponse;
import com.accenture.springai_bootcamp_demo.service.CodeReviewService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/code-review")
@RequiredArgsConstructor
public class CodeReviewController {

    private final CodeReviewService codeReviewService;

    @PostMapping
    public ResponseEntity<CodeReviewResponse> review(
            @Valid @RequestBody CodeReviewRequest request) {

        CodeReviewResponse response =
                codeReviewService.review(request.code());

        return ResponseEntity.ok(response);
    }
}