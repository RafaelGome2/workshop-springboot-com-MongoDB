package com.example.workshopmongo.dto;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
// aula 349 04/02/2026
import com.example.workshopmongo.domain.User;

public class UserDTO implements Serializable{
	 private static final long serialVersionUID = 1L;
	 
	 private String name;
	 private String id;
	 private String email;
	
	 
	 public UserDTO() {}

	 public UserDTO(User obj) {
		 name= obj.getName();
		 id=obj.getId();	
		 email=obj.getEmail();
	 }

	 public String getName() {
		 return name;
	 }
	 public void setName(String name) {
		 this.name = name;
	 }
	 public String getId() {
		 return id;
	 }
	 public void setId(String id) {
		 this.id = id;
	 }
	 public String getEmail() {
		 return email;
	 }
	 public void setEmail(String email) {
		 this.email = email;
	 }

}


