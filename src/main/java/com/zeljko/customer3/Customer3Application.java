package com.zeljko.customer3;

import com.zeljko.customer3.entity.Customer;
import com.zeljko.customer3.repository.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Customer3Application {

	public static void main(String[] args) {
		SpringApplication.run(Customer3Application.class, args);
	}

	@Bean
	CommandLineRunner runner(CustomerRepository customerRepository) {
		return args -> {

			Customer c1 = new Customer();
			c1.setFirstName("marko");
			c1.setLastName("markovic");
			c1.setEmail("marko@gmail.com");

			customerRepository.save(c1);

			Customer c2 = new Customer();
			c2.setFirstName("petar");
			c2.setLastName("petrovic");
			c2.setEmail("petar@gmail.com");

			customerRepository.save(c2);

			Customer c3 = new Customer();
			c3.setFirstName("jelena");
			c3.setLastName("jovanovic");
			c3.setEmail("jelena@gmail.com");

			customerRepository.save(c3);

			Customer c4 = new Customer();
			c4.setFirstName("ivana");
			c4.setLastName("ivanovic");
			c4.setEmail("ivana@gmail.com");

			customerRepository.save(c4);

		};
	}

}

