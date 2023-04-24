package com.kisonich.securityrole.dz32Role.repository;

import com.kisonich.securityrole.dz32Role.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
    List<Book> findByAuthorContainingIgnoreCase(String author);

    List<Book> findByNameContainingIgnoreCase(String name);

    List<Book> findByAuthorContainingIgnoreCaseAndNameContainingIgnoreCase(String author, String name);
}