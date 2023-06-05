package com.clayfin.Controller;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.clayfin.model.BankList;

@Controller
public class FormController {
	@RequestMapping("/form")
	public String print(Model m) {
		m.addAttribute("bank", new BankList());
		m.addAttribute("list", Arrays.asList("RBI","SBI","BankOfBaroda","AndhraBank","abcBank","xyzBank"));
	
		return "form";
	}
	
	@PostMapping("/store")
	public ModelAndView display(@ModelAttribute("bank") BankList bank) {
		ModelAndView mv =  new ModelAndView();
		mv.addObject("users", bank);
		mv.setViewName("display");
		return mv;
	}
	
	
}
