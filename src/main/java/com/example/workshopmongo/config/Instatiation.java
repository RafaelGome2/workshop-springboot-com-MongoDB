//aula 348 4-02-2026
package com.example.workshopmongo.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.example.workshopmongo.domain.User;
import com.example.workshopmongo.repository.UserRepository;
@Configuration
public class Instatiation implements CommandLineRunner  {

	@Autowired
	private UserRepository userRepo;
	
	@Override
	public void run(String... args) throws Exception {
		 userRepo.deleteAll();
		 User maria = new User(null, "Maria brown", "maria@gmail.com");
		 User alex= new User(null, "Alex green","alex@gmail.com");
		 User bob= new User(null, "Bob Grey", "bob@gmail.com");
		
		 userRepo.saveAll(Arrays.asList(maria, alex,bob));

}
}