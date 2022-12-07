package ie.atu.cicd.crud_demo;

import ie.atu.cicd.crud_demo.model.Book;
import ie.atu.cicd.crud_demo.repo.BookRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CrudDemoApplication {

	public static void main(String[] args)
	{
		SpringApplication.run(CrudDemoApplication.class, args);
	}

}
