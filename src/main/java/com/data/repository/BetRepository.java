package com.data.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.data.binding.Bet;

public interface BetRepository extends JpaRepository<Bet, Serializable> {

}
