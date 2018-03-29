package com.softech.project.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/all")
public class ItemController {
	
	@RequestMapping(value="/lol")
	public String getAll() {
		return "home";
	}
}
