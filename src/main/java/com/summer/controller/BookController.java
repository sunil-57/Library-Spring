package com.summer.controller;

import com.summer.dao.BookDAO;
import com.summer.models.Book;
import com.summer.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/books")
public class BookController{

    @Autowired
    private BookService bookService;

    //using service layers
    @PostMapping
    public String saveBook(@ModelAttribute Book book) {
        bookService.saveBook(book);
        return "redirect:/books";
    }

    @GetMapping
    public String getAllBooks(Model model) {
        model.addAttribute("books", bookService.getAllBooks());
        return "view-books";
    }

    @GetMapping("/item/{id}")
    public String getBookById(@PathVariable Integer id , Model model) {
        Book editBook = bookService.getBookById(id);
        if (editBook != null) {
            model.addAttribute("editBook", editBook);
        }
        return "edit-book";
    }

    @PutMapping("/edit/{id}")
    public String updateBook(@PathVariable Integer id, @ModelAttribute Book updatedBook) {
        Book existingBook = bookService.getBookById(id);
        if (existingBook != null) {
            existingBook.setBookName(updatedBook.getBookName());
            existingBook.setAuthorName(updatedBook.getAuthorName());
            existingBook.setBookNumber(updatedBook.getBookNumber());
            existingBook.setBookQuantity(updatedBook.getBookQuantity());
            bookService.saveBook(existingBook);
        }
        return "redirect:/books";
    }

    @DeleteMapping("/delete/{id}")
    public String deleteABook(@PathVariable Integer id) {
        bookService.deleteBook(id);
        return "redirect:/books";
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
