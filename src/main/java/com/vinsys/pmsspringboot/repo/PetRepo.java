package com.vinsys.pmsspringboot.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vinsys.pmsspringboot.pojo.Pet;

@Repository
public interface PetRepo extends JpaRepository<Pet, Long> {
	
	

}
