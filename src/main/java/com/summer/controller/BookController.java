package com.summer.controller;

import com.summer.dao.BookDAO;
import com.summer.models.Book;
import org.springframework.web.bind.annotation.*;


import java.sql.SQLException;
import java.util.ArrayList;

@RestController
@RequestMapping("/api")
public class BookController{
    private final BookDAO bookdao;

    public BookController(){
        try {
            bookdao = new BookDAO();
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @GetMapping("/books")
    public ArrayList<Book> getBooks() {
        return bookdao.getBooks();
    }

    @GetMapping("/book/{bookid}")
    public Book getBookInfo(@PathVariable int bookid) {
        return bookdao.getBookInfo(bookid);
    }

    @PostMapping("/books")
    public void storeBook(@RequestBody Book book){
        bookdao.insertBook(book);
    }

    @PutMapping("/updateBook")
    public void updateBook(@RequestParam int bookid, @RequestParam int bookNumber) {
        bookdao.updateBookDetail(bookid, bookNumber);
    }

    @DeleteMapping("/{bookid}")
    public String deleteBook(@PathVariable int bookid) {
        if(bookdao.deleteBookDetail(bookid)){
            return "deleted";
        }else{
            return "failed to delete";
        }
    }
}
