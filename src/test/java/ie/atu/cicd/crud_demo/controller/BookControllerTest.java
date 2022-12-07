package ie.atu.cicd.crud_demo.controller;

import ie.atu.cicd.crud_demo.model.Book;
import ie.atu.cicd.crud_demo.repo.BookRepo;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookControllerTest extends BookController{

    Book b;
    BookRepo repo;
    @BeforeEach
    void setUp() {

    }

    @Test
    public void test_add_fail()
    {
         b = new Book("efhsbef","fisfei",0);
         Exception e_message = assertThrows(IllegalStateException.class,()->{addBook(b);});
         assertEquals("Book id already exists!",e_message.getMessage());

    }

    @AfterEach
    void tearDown() {

    }
}