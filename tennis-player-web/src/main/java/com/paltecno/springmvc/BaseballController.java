package com.paltecno.springmvc;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/baseball")
public class BaseballController {
	

	
	@RequestMapping("/showStatsForm")
	public String showForm(Model model) {
		model.addAttribute("ballStats",new BaseballPlayer());
		return "head-to-head-ball";
	}
	
	
	@RequestMapping("/processStatsForms")
	public String processForm(@Valid @ModelAttribute("ballStats") BaseballPlayer ballStats,BindingResult result) {
		if(result.hasErrors()) 
			return "head-to-head-ball";
		else
			return "stats-ball-confirmation";
		
	}

}
