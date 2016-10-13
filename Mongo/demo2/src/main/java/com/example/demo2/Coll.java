package com.example.demo2;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "mycoll")
public class Coll {
	@Id
	String id;
	String fname;
		
	public Coll() {
	}
	
	public Coll(String name) {
		this.fname = name;

	}	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return fname;
	}
	public void setName(String name) {
		this.fname = name;
	}
	@Override
	public String toString(){
		return fname;
	}
}
