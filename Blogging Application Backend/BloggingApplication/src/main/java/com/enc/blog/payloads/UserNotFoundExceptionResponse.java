package com.enc.blog.payloads;

import org.springframework.http.HttpStatus;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
public class UserNotFoundExceptionResponse {
	String message;
	boolean success;
	HttpStatus status;
}
