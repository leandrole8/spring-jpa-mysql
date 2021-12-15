package com.leandroreis.springjpamysql;

import com.leandroreis.springjpamysql.model.Contact;
import com.leandroreis.springjpamysql.repository.ContactRepository;
import org.aspectj.bridge.context.CompilationAndWeavingContext;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.stream.LongStream;

@SpringBootApplication
public class SpringJpaMysqlApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringJpaMysqlApplication.class, args);
	}

	@Bean
	CommandLineRunner init(ContactRepository repository){
		return args -> {
			repository.deleteAll();
			LongStream.range(1, 11)
					.mapToObj(i -> {
						Contact c = new Contact();
						c.setName("Contact " + i);
						c.setEmail("Contact " + i + "@email.com");
						c.setPhone("(034) 99999-9999");
						return c;
					})
					.map(v -> repository.save(v))
					.forEach(System.out::println);
		};
	}

}
