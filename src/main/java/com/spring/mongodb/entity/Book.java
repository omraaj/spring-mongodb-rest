package com.spring.mongodb.entity;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document // Maps Entity class objects to JSON-formatted Documents
public class Book {

    @Id
    private String id;

    @NonNull

    private Integer bookId;

    @NonNull
    private String bookName;

    @NonNull
    private String bookAuthor;

    @NonNull
    private Double bookCost;

    //it is required for deserialization
    public Book() {

    }


    @JsonCreator
    public Book(
            @JsonProperty("bookId") Integer bookId,
            @JsonProperty("bookName") String bookName,
            @JsonProperty("bookAuthor") String bookAuthor,
            @JsonProperty("bookCost") Double bookCost
    ) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.bookCost = bookCost;
    }


    public Book(String id, Integer bookId, String bookName, String bookAuthor, Double bookCost) {
        this.id = id;
        this.bookId = bookId;
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.bookCost = bookCost;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public @NonNull Integer getBookId() {
        return bookId;
    }

    public void setBookId(@NonNull Integer bookId) {
        this.bookId = bookId;
    }

    public @NonNull String getBookName() {
        return bookName;
    }

    public void setBookName(@NonNull String bookName) {
        this.bookName = bookName;
    }

    public @NonNull String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(@NonNull String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public @NonNull Double getBookCost() {
        return bookCost;
    }

    public void setBookCost(@NonNull Double bookCost) {
        this.bookCost = bookCost;
    }
}
