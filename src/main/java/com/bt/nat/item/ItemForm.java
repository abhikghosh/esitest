package com.bt.nat.item;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;

public class ItemForm {

	private static final String NOT_BLANK_MESSAGE = "{notBlank.message}";
	private static final String EMAIL_MESSAGE = "{email.message}";

	@NotBlank(message = ItemForm.NOT_BLANK_MESSAGE)
	@Email(message = ItemForm.EMAIL_MESSAGE)
	private String email;

	@NotBlank(message = ItemForm.NOT_BLANK_MESSAGE)
	private String password;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
