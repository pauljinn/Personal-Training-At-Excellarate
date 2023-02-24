package com.enc.blog.payloads;

import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDto {
	private Long id;
	@NotBlank(message = "Name can't be blank")
	private String name;
	private String email;
	private String password;
	private String about;
}
