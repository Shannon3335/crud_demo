package ie.atu.cicd.crud_demo.repo;

// Java Program to Illustrate BookRepo File

import ie.atu.cicd.crud_demo.model.Book;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.http.ResponseEntity;

import java.util.Optional;

public interface BookRepo extends MongoRepository<Book, Integer> {
    Optional <Book> findBookbyId(int id);
}