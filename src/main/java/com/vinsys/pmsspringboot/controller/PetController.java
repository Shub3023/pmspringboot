package com.vinsys.pmsspringboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.vinsys.pmsspringboot.pojo.Pet;
import com.vinsys.pmsspringboot.service.PetService;

@RestController
public class PetController {
	
	@Autowired
	private PetService petService;
	
	@PostMapping("/addpet")
	public String addPet(@RequestBody Pet pet) {

		Pet addPet = petService.addPet(pet);
		System.out.println(addPet);
		return null;

	}
	@DeleteMapping("/deletepet")
	public String deletePet(long id) {
		
		Pet deletePet=petService.deletePet(id);
		return null;
		
		
	}

	@GetMapping("/getpet")
    public String getPetById(@RequestParam long id) {
		
		Pet getPet=petService.getPetById(id);
		System.out.println("Deleted record is:"+getPet);
		return null;
		
	}
	
	@PutMapping("/updatepet")
	public String updatePet(@RequestBody Pet pet) {
		Pet updatePet = petService.updatePet(pet);
		System.out.println("updated student is:"+updatePet);
		return null;
		
	}

}
