package com.spring.mongo.demo.model;

import lombok.Builder;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Data
@AllArgsConstructor
@Builder
@Document(collection = "super_hero")
public class SuperHero implements Serializable {
	
	public SuperHero() {
		
	}

	public SuperHero(String name, String superName,String profession,int age,boolean canFly) {
		this.name=name;
		this.superName=superName;
		this.age=age;
		this.canFly=canFly;
		this.profession=profession;
	}
	
    @Id
    private String id;

    private String name;
    private String superName;
    private String profession;
    private int age;
    private boolean canFly;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSuperName() {
		return superName;
	}
	public void setSuperName(String superName) {
		this.superName = superName;
	}
	public String getProfession() {
		return profession;
	}
	public void setProfession(String profession) {
		this.profession = profession;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isCanFly() {
		return canFly;
	}
	public void setCanFly(boolean canFly) {
		this.canFly = canFly;
	}
    
    
    

    // Constructor, Getter and Setter
}