package com.bt.nat.item;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

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

	@RequestMapping(value = "itemAdd", method = RequestMethod.POST)
	public @ResponseBody
	String itemAdd(@RequestParam(value = "id") String id,
			@RequestParam(value = "value") String value,
			@RequestParam(value = "columnName") String columnName,
			@RequestParam(value = "columnId") String columnId,
			@RequestParam(value = "columnPosition") String columnPosition,
			@RequestParam(value = "rowId") String rowId, ModelMap model)
			throws ParseException {

		TEsitestItems item = itemRepository.findById(new Long(id));
		System.out.println(item.getTeiNextCheckDate());

		if ("Next Check Date".equals(columnName)) {
			SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
			Date date = format.parse(value);
			item.setTeiNextCheckDate(date);
		}

		if ("Remarks".equals(columnName)) {
			item.setTeiRemarks(value);
		}

		itemRepository.update(item);

		return value;
	}
}
