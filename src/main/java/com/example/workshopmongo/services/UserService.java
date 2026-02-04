package com.example.workshopmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.workshopmongo.domain.User;
import com.example.workshopmongo.repository.UserRepository;

//aula 347 - 03-02-2026
@Service
public class UserService {
	@Autowired
	private UserRepository repo;
	
 public List<User> findAll(){
	 return repo.findAll();
 }
}
