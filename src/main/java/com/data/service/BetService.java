package com.data.service;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.data.binding.Bet;
import com.data.binding.Bets;
import com.data.repository.BetRepository;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class BetService {

	@Autowired
	private BetRepository betRepository;
	
	public List<Bet> saveBetsFromJson() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        Bets readValue = objectMapper.readValue(new File("src/main/resources/bet.json"), new TypeReference<Bets>(){});
        ArrayList<Bet> bets = readValue.bets;
        List<Bet> saveAll = betRepository.saveAll(bets);
        return saveAll;
    }
}
