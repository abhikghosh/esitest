package com.bt.nat.home;

import java.security.Principal;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bt.nat.account.AccountRepository;

@Controller
public class HomeController {
	@Autowired
	private AccountRepository accountRepository;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index(Principal principal, HttpSession session) {
		System.out.println("in index --> " + principal);
		if (principal != null) {
			session.setAttribute("currentUser", accountRepository
					.findByEin(new Integer(principal.getName())));
			return "home/homeSignedIn";
		} else {
			session.removeAttribute("currentUser");
			return "signin/signin";
		}
	}
}
