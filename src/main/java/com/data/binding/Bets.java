package com.data.binding;

import java.util.ArrayList;

import jakarta.persistence.ElementCollection;
import lombok.Data;

@Data
public class Bets{
	
	@ElementCollection
    public ArrayList<Bet> bets;
}