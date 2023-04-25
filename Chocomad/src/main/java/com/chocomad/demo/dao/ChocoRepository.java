package com.chocomad.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.chocomad.demo.model.Chocolates;

@Repository
public interface ChocoRepository extends JpaRepository<Chocolates,Integer> {
	

}
