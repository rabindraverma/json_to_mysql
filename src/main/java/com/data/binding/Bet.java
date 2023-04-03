package com.data.binding;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Embeddable
@Entity
public class Bet {
	@Id
	public int id;
	public int numbets;
	public String game;
	public int stake;
	public int returns;
	public int clientid;
	public String date;
}