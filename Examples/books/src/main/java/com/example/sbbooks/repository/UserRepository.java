package com.example.sbbooks.repository;

import com.example.sbbooks.book.Book;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<Book,Integer>
{

}
