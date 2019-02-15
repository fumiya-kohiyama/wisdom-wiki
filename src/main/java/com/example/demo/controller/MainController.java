package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.DemoModel;
import com.example.demo.repositry.DemoRepositry;

@Controller
public class MainController {
	
	@Autowired
	DemoRepositry demo;
	
	@RequestMapping("/main")
	public String mainmenu(Model model) {
		
		List<DemoModel> list = demo.findAll();
		String name = list.get(0).getName();
		model.addAttribute("test",name);
		
		return "mainmenu";
	}
}
