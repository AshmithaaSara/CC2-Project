package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Medical {
	@Id
	private int id;
	private String name;
	private String hemoglobin;
	private String blood_pressure;
	private String sugar_level;
	private int height;
	private int weight;
	public Medical(int id, String name, String hemoglobin, String blood_pressure, String sugar_level, int height,
			int weight) {
		super();
		this.id = id;
		this.name = name;
		this.hemoglobin = hemoglobin;
		this.blood_pressure = blood_pressure;
		this.sugar_level = sugar_level;
		this.height = height;
		this.weight = weight;
	}
	public Medical() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHemoglobin() {
		return hemoglobin;
	}
	public void setHemoglobin(String hemoglobin) {
		this.hemoglobin = hemoglobin;
	}
	public String getBlood_pressure() {
		return blood_pressure;
	}
	public void setBlood_pressure(String blood_pressure) {
		this.blood_pressure = blood_pressure;
	}
	public String getSugar_level() {
		return sugar_level;
	}
	public void setSugar_level(String sugar_level) {
		this.sugar_level = sugar_level;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	
	

}
