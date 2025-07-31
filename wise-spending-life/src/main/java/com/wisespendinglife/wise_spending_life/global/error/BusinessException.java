package com.wisespendinglife.wise_spending_life.global.error;


import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

/**
 * 도메인 계층에서 throw 하는 커스텀 런타임 예외의 베이스 클래스.
 */
@Getter
@AllArgsConstructor
public class BusinessException extends RuntimeException {
    private final HttpStatus httpStatus;  // HTTP 상태코드
    private final String errorCode;  // 에러 코드
    private final String errorMessage;  // 에러 메시지(정확한)


}