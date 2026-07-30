package com.library.library_ai.repository;
import com.library.library_ai.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
    // No methods needed – Spring Boot gives us save(), findAll(), findById(), deleteById() automatically!
}
