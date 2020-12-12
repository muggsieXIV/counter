package com.bww.counter.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
	
	@RequestMapping("/")
	public String index(HttpSession session, Model model) {
		Object sessionCount = session.getAttribute("count");
		if(sessionCount == null) {
			session.setAttribute("count", 0);
		}
		session.setAttribute("count", (Integer) session.getAttribute("count") + 1);
		model.addAttribute("count", session.getAttribute("count"));
		
		return "index.jsp";
	}
	@RequestMapping("/clear")
	public String clear(HttpSession session) {
		session.invalidate();
		return "redirect:/";
	}
	@RequestMapping("/form")
	public String showForm() {
		return "form.jsp";
	}
	@RequestMapping(path="/survey", method=RequestMethod.POST)
	public String otherResult(@RequestParam String username, @RequestParam String password, HttpSession sesh) {
		System.out.println(username.toString());
		System.out.println(password.toString());
		
		sesh.setAttribute("username", username);
		sesh.setAttribute("password", password);
		return "redirect:/result";
	}
	@RequestMapping("/result")
	public String result(HttpSession sesh, Model model) {
		Object username = sesh.getAttribute("username");
		Object password = sesh.getAttribute("password");
		
		if(username == null) {
			model.addAttribute("username", "");
		} else {
			model.addAttribute("username", username.toString());
		}
		if(password == null) {
			model.addAttribute("password", "");
		} else {
			model.addAttribute("password", password.toString());
		}
		return "results.jsp";
	}
}
