package com.hnd.book.dto;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name="Book")
public class BookDto    {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
      private int bookId;
    private String title;
    private String authorName;
    private String publishedYear;
    private String publisher;
    private Long isbn;
    private int price;

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getPublishedYear() {
        return publishedYear;
    }

    public void setPublishedYear(String publishedYear) {
        this.publishedYear = publishedYear;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Long getIsbn() {
        return isbn;
    }

    public void setIsbn(Long isbn) {
        this.isbn = isbn;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public BookDto(int bookId, String title, String authorName, String publishedYear, String publisher, Long isbn, int price) {
        this.bookId = bookId;
        this.title = title;
        this.authorName = authorName;
        this.publishedYear = publishedYear;
        this.publisher = publisher;
        this.isbn = isbn;
        this.price = price;
    }

    public BookDto(){
        super();
    }

    @Override
    public String toString() {
        return "BookDto{" +
                "bookId=" + bookId +
                ", title='" + title + '\'' +
                ", authorName='" + authorName + '\'' +
                ", publishedYear='" + publishedYear + '\'' +
                ", publisher='" + publisher + '\'' +
                ", isbn=" + isbn +
                ", price=" + price +
                '}';
    }
}

