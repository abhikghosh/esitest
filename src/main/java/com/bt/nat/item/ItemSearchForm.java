package com.bt.nat.item;

import org.hibernate.validator.constraints.NotBlank;

public class ItemSearchForm {

	private static final String NOT_BLANK_MESSAGE = "{notBlank.message}";

	@NotBlank(message = ItemSearchForm.NOT_BLANK_MESSAGE)
	private String item;

	@NotBlank(message = ItemSearchForm.NOT_BLANK_MESSAGE)
	private int type;

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

}
