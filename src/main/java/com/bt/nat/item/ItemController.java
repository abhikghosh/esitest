package com.bt.nat.item;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ItemController {

	private static final String ITEM_VIEW_NAME = "home/homeSignedIn";

	@Autowired
	private ItemRepository itemRepository;

	@RequestMapping(value = "additem")
	public String addItem(Model model) {
		model.addAttribute(new ItemSearchForm());
		return ITEM_VIEW_NAME;
	}

	@RequestMapping(value = "itemSearch", method = RequestMethod.POST)
	public String itemSearch(
			@Valid @ModelAttribute ItemSearchForm itemSearchForm,
			Errors errors, ModelMap model) {
		if (errors.hasErrors()) {
			return ITEM_VIEW_NAME;
		}

		String item = itemSearchForm.getItem();
		int type = itemSearchForm.getType();
		List<TEsitestItems> items = null;

		switch (type) {
		case 1:
			items = itemRepository.findByEin(new Integer(item));
			break;
		}

		model.addAttribute("items", items);
		return ITEM_VIEW_NAME;
	}
}
