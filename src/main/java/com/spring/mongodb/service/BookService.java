package com.spring.mongodb.service;


import com.spring.mongodb.entity.Book;
import com.spring.mongodb.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

      public List<Book> getAllBooks(){
          return bookRepository.findAll();
      }
      public Optional<Book> getBookbyId(String id){
          return bookRepository.findById(id);
      }

      public Book saveBook(Book book){
          return bookRepository.save(book);
      }


      public Optional<Book> updateBook(String id,Book book){
        Optional<Book> existingBook = bookRepository.findById(id);
        if (existingBook.isPresent()){
            Book updateBbook = existingBook.get();
            updateBbook.setBookName(book.getBookName());
            updateBbook.setBookAuthor(book.getBookAuthor());
            updateBbook.setBookCost(book.getBookCost());
            return Optional.of(bookRepository.save(updateBbook));

        }else {
            return Optional.empty();
        }
      }
      public void deleteById(String id){
           bookRepository.deleteById(id);
      }
      public List<Book> findBookByName(String bookName){

          return bookRepository.findBookByBookName(bookName);
      }

      public List<Book> findBookByAuthor(String bookAuthor){
          return  bookRepository.findBookByBookAuthor(bookAuthor);
      }

      //custom query service
      public List<Book> findBooksCostGreaterThan(Double cost){
          return bookRepository.findBooksCostGreaterThan(cost);
      }
}
