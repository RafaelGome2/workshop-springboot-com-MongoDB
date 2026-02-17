package com.example.workshopmongo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.workshopmongo.domain.Post;
import com.example.workshopmongo.repository.PostRepository;
import com.example.workshopmongo.services.exception.ObjectNotFoundException;

//aula 347 - 03-02-2026
@Service
public class PostService {
	@Autowired
	private PostRepository repo;

	
	// metodo que procura por id, caso não encontrado lança a exceção abaixo
	public Post findById(String id) {
		Optional<Post> post = repo.findById(id);
		if (post.isEmpty()) {
			throw new ObjectNotFoundException("Objeto nao encontrado");
		}
		return post.get();}
	
// aula 361 11/02/2026
	public List<Post> findByTitle(String txt){
	return repo.findByTitleContainingIgnoreCase(txt);
}
	//aula 361 12/2/2026
	public List<Post> findTitle(String txt){
		return repo.searchTitle(txt);
			}
	
// para pesquisar por Autor e Title
	public List<Post>  findbyAutorAndTitle(String txt, String txt2){
		return repo.findByAutorAndTitle(txt, txt2);
	}
}