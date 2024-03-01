package org.dnyanyog.dto;

import org.springframework.stereotype.Component;
import com.fasterxml.jackson.annotation.JsonInclude;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Component
public class UserData {

	private long userId;

	@NotNull(message = "Username is mandatory")
	@NotBlank(message = "Username should not be blank")
	@Size(max = 50, message = "Username length should be at most 50 characters")
	private String username;

	@NotNull(message = "Password is mandatory")
	@NotBlank(message = "Password should not be blank")
	private String password;

	@NotNull(message = "Email id is mendatory")
	@NotBlank(message = "Email id should not be blank")
	@Email(message = "Invalid email format")
	private String email;

	private String age;

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}
}
