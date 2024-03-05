package com.vinsys.pmsspringboot.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vinsys.pmsspringboot.pojo.Pet;
import com.vinsys.pmsspringboot.repo.PetRepo;

@Service
public class PetService {
	
	@Autowired
	private PetRepo petRepo;

	public Pet addPet(Pet pet) {
		
		return petRepo.save(pet) ;
	}

	public Pet deletePet(long id) {
		Pet deletePet = getPetById(id);
		
		if (deletePet != null) {
			petRepo.delete(deletePet);
        }
        return deletePet;
	
	}

	public Pet getPetById(long id) {
		 Optional<Pet> optional = petRepo.findById(id);
	        return optional.orElse(null);
		
	}

	public Pet updatePet(Pet pet) {
		// TODO Auto-generated method stub
		return petRepo.save(pet);
	}
	
	

}
