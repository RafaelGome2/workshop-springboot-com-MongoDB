package com.example.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.workshopmongo.domain.Post;
import com.example.workshopmongo.domain.User;
import java.util.List;

//aula 355 07/2/2026, consultas personalizadas
@Repository
public interface PostRepository extends MongoRepository<Post, String> {
	// options 'i' ignora case
	@Query("{'title':{'$regex: '?0', $options: 'i'}}")
	public List<Post> searchTitle(String txt);
	
	//16/02/26 https://www.mongodb.com/pt-br/docs/compass/query/filter/
	@Query("{$or: [ { 'autor.name': '?0' },{ title: '?1' }]}")
	public List<Post> findByAutorAndTitle(String txt, String txt2);

	public List<Post> findByTitleContainingIgnoreCase(String txt);

}
