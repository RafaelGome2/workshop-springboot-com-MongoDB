//aula 348 4-02-2026
package com.example.workshopmongo.config;

import java.lang.reflect.Array;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.TimeZone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.example.workshopmongo.domain.Post;
import com.example.workshopmongo.domain.User;
import com.example.workshopmongo.dto.AutorDto;
import com.example.workshopmongo.repository.PostRepository;
import com.example.workshopmongo.repository.UserRepository;
@Configuration
public class Instatiation implements CommandLineRunner  {

	@Autowired
	private UserRepository userRepo;
	@Autowired
	private PostRepository postRepo;

	
	@Override
	public void run(String... args) throws Exception {
		
		
	
		User maria = new User("Maria brown", null,"maria@gmail.com");
		User alex = new User("Alex green", null, "alex@gmail.com");
		userRepo.deleteAll();
		postRepo.deleteAll();
		userRepo.saveAll(Arrays.asList(maria, alex));
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		sdf.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		Post post1 = new Post(null, sdf.parse("21/03/2018"),"Partiu viagem", "vou viajar para São Paulo.Abraços!", new AutorDto(maria));
		Post post2= new Post(null, sdf.parse("23/03/2018"), "Bom dia", "acordei feliz hoje!", new AutorDto( maria));
		
		postRepo.saveAll(Arrays.asList(post1, post2));
		maria.getPosts().addAll(Arrays.asList(post1, post2));
		userRepo.save(maria);
	}
}