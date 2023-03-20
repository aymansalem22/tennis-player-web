package com.paltecno.springmvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TennisController {
	
	@RequestMapping(value="/")
	public String welcome() {
		return "main-menu";
	}
	
	@RequestMapping("/showPlayerForm")
	public String showForm () {
	    return "search-player-form";
	}
	
	@RequestMapping("/processPlayerForm")
	public String processForm (HttpServletRequest request,Model model) {
		String pName=request.getParameter("playerName");
		model.addAttribute("name",pName);
	    return "player-detail";
	}
	
	
	
	
	
	
	
	
	
	

}
