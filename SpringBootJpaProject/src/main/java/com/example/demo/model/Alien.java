package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Alien {
	
	@Id
	String alienName;
	int alienId;
	
	
	public String getAlienName() {
		return alienName;
	}
	public void setAlienName(String alienName) {
		this.alienName = alienName;
	}
	public int getAlienId() {
		return alienId;
	}
	public void setAlienId(int alienId) {
		this.alienId = alienId;
	}
	
	@Override
	public String toString() {
		return "Alien [alienName=" + alienName + ", alienId=" + alienId + "]";
	}
	
	

}
