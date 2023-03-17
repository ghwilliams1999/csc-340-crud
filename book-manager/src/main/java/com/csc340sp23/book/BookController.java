package com.csc340sp23.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author ghwil
 */
@Controller
@RequestMapping("/book")
public class BookController {
    
    @Autowired
    BookService bookService;
    
    
    @GetMapping("/all")
    public String getBooks(Model model) {
        model.addAttribute("bookList", bookService.getAllBooks());
        return "book/list-books";
    }
    
    
    @GetMapping("/id={id}")
    public String getBook(@PathVariable long id, Model model) {
        model.addAttribute("product", bookService.getBook(id));
        return "book/book-detail";
    }
    
    @GetMapping("/delete/id={id}")
    public String deleteBook(@PathVariable long id, Model model) {
        bookService.deleteBook(id);
        return "redirect:/book/all";
    }
    
    @PostMapping("/create")
    public String createBook(Book book) {

        bookService.saveBook(book);
        return "redirect:/book/all";
    }
    
    @PostMapping("/update")
    public String updateBook(Book book) {
        bookService.saveBook(book);
        return "redirect:/book/all";
    }
    
    @GetMapping("/new-book")
    public String newBookForm(Model model) {
        return "book/new-book";
    }
    
    @GetMapping("/update/id={id}")
    public String updateBookForm(@PathVariable long id, Model model) {
        model.addAttribute("book", bookService.getBook(id));
        return "book/update-book";
    }
}
