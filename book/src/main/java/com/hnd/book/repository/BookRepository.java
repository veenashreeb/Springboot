package com.hnd.book.repository;

import com.hnd.book.dto.BookDto;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<BookDto,Integer> {

    public BookDto findById(int BookId);

}
