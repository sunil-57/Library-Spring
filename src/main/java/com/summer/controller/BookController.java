package com.summer.controller;

import com.summer.dao.BookDAO;
import com.summer.models.Book;
import com.summer.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/books")
public class BookController{

    @Autowired
    private BookService bookService;

    //using service layers
    @PostMapping
    public Book saveBook(@RequestBody Book book) {
        return bookService.saveBook(book);
    }

    @GetMapping
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }

    @GetMapping("/{id}")
    public Book getBookById(@PathVariable int id) {
        return bookService.getBookById(id);
    }

    @DeleteMapping("/{id}")
    public String deleteABook(@PathVariable int id) {
        bookService.deleteBook(id);
        return "Book deleted";
    }

//    private final BookDAO bookdao;
//
//    public BookController(){
//        try {
//            bookdao = new BookDAO();
//        } catch (SQLException | ClassNotFoundException e) {
//            throw new RuntimeException(e);
//        }
//    }
//    @GetMapping("/books")
//    public ArrayList<Book> getBooks() {
//        return bookdao.getBooks();
//    }
//
//    @GetMapping("/book/{bookid}")
//    public Book getBookInfo(@PathVariable int bookid) {
//        return bookdao.getBookInfo(bookid);
//    }
//
//    @PostMapping("/books")
//    public void storeBook(@ModelAttribute  Book book){
//        bookdao.insertBook(book);
//    }
//
//    @PutMapping("/updateBook")
//    public void updateBook(@RequestParam int bookid, @RequestParam int bookNumber) {
//        bookdao.updateBookDetail(bookid, bookNumber);
//    }
//
//    @DeleteMapping("/{bookid}")
//    public String deleteBook(@PathVariable int bookid) {
//        if(bookdao.deleteBookDetail(bookid)){
//            return "deleted";
//        }else{
//            return "failed to delete";
//        }
//    }



}
