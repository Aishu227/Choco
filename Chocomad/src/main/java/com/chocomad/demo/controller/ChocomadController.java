
package com.chocomad.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.chocomad.demo.model.Chocolates;
import com.chocomad.demo.service.ChocomadService;
@RestController
public class ChocomadController
{
	@Autowired
	ChocomadService chService;
	
	
	@PostMapping(value="/save")
	public Chocolates save(@RequestBody Chocolates s)
	{
		return chService.save(s);
	}
	@PutMapping(value="/update")
	public Chocolates update(@RequestBody Chocolates s)
	{
		return chService.save(s); 
	}
	@DeleteMapping(value="/delete/{billno}")
	public void delete(@PathVariable("billno") int billno)
	{
		chService.delete(billno);
	}
	@GetMapping(value="/get/{billno}")
	public Chocolates get(@PathVariable("billno") int billno)
	{
		return chService.get(billno);
	}

}