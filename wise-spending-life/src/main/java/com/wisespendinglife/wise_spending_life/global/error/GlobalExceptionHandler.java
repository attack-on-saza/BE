package com.wisespendinglife.wise_spending_life.global.error;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;

/**
 * 애플리케이션 전역 예외를 한 곳에서 처리.
 */
@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {

    /**
     * TODO: 검증 에러 처리 (Validation)
     */

    /** 1️⃣ 도메인 계층에서 발생한 커스텀 예외 */
    @ExceptionHandler(BusinessException.class)
    protected ResponseEntity<ErrorResponse> handleBusinessException(BusinessException e) {

        log.error("도메인 에러: {} (발생시간: {})", e.getErrorMessage(), LocalDateTime.now());

        return ResponseEntity
                .status(e.getHttpStatus())
                .body(ErrorResponse.of(e.getErrorCode(), e.getErrorMessage()));
    }

    /** 2️⃣ 잘못된 HTTP Method */
    @ExceptionHandler(HttpRequestMethodNotSupportedException.class)
    protected ResponseEntity<ErrorResponse> handleMethodNotAllowed(HttpRequestMethodNotSupportedException e) {
        ErrorCode code = ErrorCode.METHOD_NOT_ALLOWED;

        log.error("잘못된 HTTP 메소드 요청: {} (발생시간: {})", e.getMessage(), LocalDateTime.now());

        return ResponseEntity
                .status(code.getHttpStatus())
                .body(ErrorResponse.of(code));
    }

    /** 3️⃣ 알 수 없는 예외—최종 안전망 */
    @ExceptionHandler(Exception.class)
    protected ResponseEntity<ErrorResponse> handleUnhandledException(Exception e) {

        log.error("Unhandled exception at {}: {}", LocalDateTime.now(), e.getMessage(), e);

        ErrorCode code = ErrorCode.INTERNAL_SERVER_ERROR;
        return ResponseEntity
                .status(code.getHttpStatus())
                .body(ErrorResponse.of(code));
    }
}