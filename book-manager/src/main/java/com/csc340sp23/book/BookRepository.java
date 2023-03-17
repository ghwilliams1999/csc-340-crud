package com.csc340sp23.book;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author ghwil
 */
public interface BookRepository extends JpaRepository<Book, Long>{
    
}
