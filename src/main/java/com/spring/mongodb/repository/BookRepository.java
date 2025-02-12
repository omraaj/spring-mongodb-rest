package com.spring.mongodb.repository;

import com.spring.mongodb.entity.Book;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface BookRepository extends MongoRepository<Book,String> {
    List<Book> findBookByBookName(String bookName);
    List<Book> findBookByBookAuthor(String bookAuthor);

    //custome query
    @Query("{ 'bookCost':{$gt: ?0} }")
    List<Book> findBooksCostGreaterThan(Double cost);
}
