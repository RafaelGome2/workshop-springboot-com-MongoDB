package com.example.workshopmongo.dto;

import java.io.Serializable;

import com.example.workshopmongo.domain.User;

public class AutorDto implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String id;
	private String name;
	
	public AutorDto() {}
// tipo de construtor	
	public AutorDto(User obj) {
		id = obj.getId();
		name = obj.getName();
	}

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
		
	
}
