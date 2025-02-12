//package com.spring.mongodb.service;
//
//import com.spring.mongodb.entity.Book;
//import com.spring.mongodb.repository.BookRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//
//import java.util.List;
//import java.util.Optional;
//
//@Component
//public class findAllOperationRunner implements CommandLineRunner {
//
//    @Autowired
//    private BookRepository bookRepo;
//
//
//    @Override
//    public void run(String... args) throws Exception {
//
//        List<Book> bookList=bookRepo.findAll();
//        bookList.forEach(System.out::println);
//
//        Optional<Book> opt = bookRepo.findById("ISB:08921");
//        if (opt.isPresent()){
//           Book b1 = opt.get();
//            System.out.println("Datails of book"+b1);
//        }else {
//            System.out.println("given id is not found");
//        }
//
//        bookRepo.deleteById("ISB:08921");
//        bookRepo.deleteAll();
//    }
//}
