package com.csc340sp23.book;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ghwil
 */

@Service
public class BookService {
    
    
    @Autowired
    private BookRepository repo;
    
    
    public List<Book> getAllBooks() {
        return repo.findAll();
    }
    
    public Book getBook(long id) {
        return repo.getReferenceById(id);
    }
    
    public void deleteBook(long id) {
        repo.deleteById(id);
    }
    
    void saveBook(Book book) {

        repo.save(book);
    }
}
