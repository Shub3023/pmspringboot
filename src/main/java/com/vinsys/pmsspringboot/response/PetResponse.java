package com.vinsys.pmsspringboot.response;

import java.util.List;

import com.vinsys.pmsspringboot.pojo.Pet;


public class PetResponse {
	
	private String messagge;
	private int status;
	private Pet pet;
	private List<Pet> pets;
	public String getMessagge() {
		return messagge;
	}
	public void setMessagge(String messagge) {
		this.messagge = messagge;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public Pet getPet() {
		return pet;
	}
	public void setPet(Pet pet) {
		this.pet = pet;
	}
	public List<Pet> getPets() {
		return pets;
	}
	public void setPets(List<Pet> pets) {
		this.pets = pets;
	}

}
