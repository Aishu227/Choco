package com.chocomad.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chocomad.demo.dao.ChocoRepository;
import com.chocomad.demo.model.Chocolates;

@Service
public class ChocomadService {
	
	@Autowired
	ChocoRepository ChRepository;

	public List<Chocolates> getAll()
	{
		List<Chocolates> ChList = ChRepository.findAll();
		return ChList;
	}
	
	public Chocolates save(Chocolates s)
	{
		Chocolates obj = ChRepository.save(s);
		return obj;
	}
	public Chocolates update(Chocolates s)
	{
		Chocolates obj=ChRepository.save(s);
		return obj;
	}
	public void delete(int billno)
	{
		ChRepository.deleteById(billno);
	}
	public Chocolates get(int billno)
	{
		Chocolates s=ChRepository.findById(billno).get();
		return s;
	}
}
