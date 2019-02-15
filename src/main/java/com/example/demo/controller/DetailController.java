package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.detailForm;

@Controller
public class DetailController {

	@RequestMapping("/detail")
	public String index(detailForm detail) {
		return "detail";
	}
	
	@RequestMapping(value="/test", method = RequestMethod.POST)
	public String input(detailForm detail) {
		String tytle = detail.getTytle();
		String message = detail.getMainMessage();
		
		detail.setErrorMessage("");
		if(tytle == "" || message == "") {
			detail.setErrorMessage("蠢�鬆磯��逶ｮ縺ｧ縺�");
		}
		return "detail";
	}
}
