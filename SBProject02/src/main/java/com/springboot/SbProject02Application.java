package com.springboot;

import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.springboot.entity.User;
import com.springboot.repository.UserRepository;

@SpringBootApplication
public class SbProject02Application {

	public static void main(String[] args) {
		 ConfigurableApplicationContext run = SpringApplication.run(SbProject02Application.class, args);
		
		UserRepository repository = run.getBean(UserRepository.class);
		
		//Create
//		User user=new User(3,"Monu","Hyderabad",74);
//		repository.save(user);
//		System.out.println(user);
		
		//Update
//		Optional<User> optional = repository.findById(3);
//		User user = optional.get();
//		user.setAddress("Lahore");
//		user.setAge(61);
//		repository.save(user);
		
		//DELETE
		
		repository.deleteById(52);
		
	}

}
