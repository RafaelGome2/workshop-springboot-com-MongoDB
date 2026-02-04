package com.example.workshopmongo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import com.example.workshopmongo.domain.User;
import com.example.workshopmongo.repository.UserRepository;
import com.example.workshopmongo.services.exception.ObjectNotFoundException;

//aula 347 - 03-02-2026
@Service
public class UserService {
	@Autowired
	private UserRepository repo;
	
 public List<User> findAll(){
	 return repo.findAll();
 }
 //metodo que procura por id, caso não encontrado lança a exceção abaixo
  public User findById(String id) {
  	Optional<User> user = repo.findById(id); 
  	if(user.isEmpty()) {
  		throw new ObjectNotFoundException("Objeto nao encontrado");
  	}
  	return user.get();
  }
}
