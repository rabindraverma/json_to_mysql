package com.data.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.data.binding.Bet;
import com.data.service.BetService;

@RestController
public class BetController {
	
	@Autowired
	private BetService betService;
	
	@GetMapping("/")
	public List<Bet> getBetsDetails() throws IOException {
	List<Bet> saveBetsFromJson = betService.saveBetsFromJson();
		System.out.println(saveBetsFromJson);
		return saveBetsFromJson;
		
	}

}
