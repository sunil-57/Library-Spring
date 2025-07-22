package com.summer.library;

import com.summer.dao.BookDAO;
import com.summer.models.Book;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;
import java.util.ArrayList;

@RestController
public class HelloWorldController {

    BookDAO bookdao;

    {
        try {
            bookdao = new BookDAO();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @GetMapping("/")
    public String hello() {
        return "Hello, World!";
    }
    @GetMapping("/books")
    public ArrayList<Book> getBooks() {
        return bookdao.getBooks();
    }
}
