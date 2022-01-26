package com.desafio.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {

	@RequestMapping("/")
	public String index() {

		return "index";
	}

	@RequestMapping("/sobre")
	public ModelAndView sobre() {

		ModelAndView modelAndView = new ModelAndView("/sobre/sobre");

		return modelAndView;
	}
}