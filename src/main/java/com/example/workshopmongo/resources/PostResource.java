package com.example.workshopmongo.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.workshopmongo.domain.Post;
import com.example.workshopmongo.resources.util.URL;
import com.example.workshopmongo.services.PostService;

@RestController
@RequestMapping(value = "/post")
public class PostResource {
	@Autowired
	private PostService service;

	@GetMapping(value = "/{id}")
	public ResponseEntity<Post> findById(@PathVariable String id) {
		Post obj = service.findById(id);

		return ResponseEntity.ok().body(obj);
	};
	
	//aula 361
	@GetMapping (value = "/titlesearch")
	public ResponseEntity<List<Post>> findByTitle	(@RequestParam (value= "txt", defaultValue = "") String txt){
		txt= URL.decodeParam(txt);
		List<Post> listaPost = service.findByTitle(txt);
		return ResponseEntity.ok().body(listaPost);
	}
	

}