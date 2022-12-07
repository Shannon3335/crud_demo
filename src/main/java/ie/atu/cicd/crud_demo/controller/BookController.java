package ie.atu.cicd.crud_demo.controller;

import ie.atu.cicd.crud_demo.model.Book;
import ie.atu.cicd.crud_demo.repo.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.management.Query;
import java.util.List;

@RestController

public class BookController {
    @Autowired
    private BookRepo repo;
    @PostMapping("/addBook")
    public String addBook(@RequestBody Book book){
        if(repo.existsById(book.getId())) {

            throw new IllegalStateException("Book id already exists!");
        }
        else {
            repo.save(book);
        }
        return "Added Successfully";
    }

    @GetMapping("/findAllBooks")
    public List<Book> getBooks() {

        return repo.findAll();
    }

/*
    @GetMapping("/findBook")
    repo.findBookbyid(@PathVariable(value = "id")  int id)
    {
       return repo.findById(id).ifPresentOrElse(b ->{return b;},()-> {throw new IllegalStateException("Book does not exist");});
    }
*/

    @DeleteMapping("/delete/{id}")
    public String deleteBook(@PathVariable int id){
        repo.deleteById(id);

        return "Deleted Successfully";
    }

}
