//package com.spring.mongodb.service;
//
//import com.spring.mongodb.entity.Book;
//import com.spring.mongodb.repository.BookRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//
//import java.util.Arrays;
//
//@Component
//public class saveOperationRunner implements CommandLineRunner {
//
//    @Autowired
//    private BookRepository bookRepo;
//    @Override
//    public void run(String... args) throws Exception {
//
//        bookRepo.saveAll(Arrays.asList(
//           new Book(101,"Core java","harvey Spectre",1039.77),
//        new Book(102,"Advanced java","Mike Rosss",1339.49),
//        new Book(103,"Spring","James bond",1433.23),
//        new Book(104,"Spring Boot","Ragnar lothbrok",3238.34),
//        new Book(105,"Spring Security","Saul goodman",1897.75)
//        ));
//
//        Book book = bookRepo.save(new Book("ISB:08921",106,"Demobook","Sham",564.32));
//
//        bookRepo.save(new Book(book.getId(), 106,"Demobook","Sham",564.32));
//
//        bookRepo.insert(new Book(506,"Java Design Patterns", "Kathy Sierra", 924.0)); // insert
//
//        System.out.println("All Data saved into MongoDB");
//    }
//}
