package com.example.sbbooks.service;

import com.example.sbbooks.book.Book;
import com.example.sbbooks.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class UserService
{
    @Autowired
    UserRepository userrepo;
    //all books
    public List<Book> getAllBooks(){
        List<Book> books = new ArrayList<>();
        userrepo.findAll().forEach(book->books.add(book));
        return books;
    }
    //based on id
    public Book getBookById(int id)
    {
        return userrepo.findById(id).get();
    }
    //save or update book
    public void saveOrUpdate(Book book)
    {
        userrepo.save(book);
    }
     public void updateBook(int id, Book book)
     {
         List<Book> books = new ArrayList<>();
         userrepo.findAll().forEach(b->books.add(b));

         for(Book b: books)
         {
             if(b.getId()==id)
             {
                 b.setId(book.getId());
                 b.setName(book.getName());
                 b.setAuthor(book.getAuthor());
                 b.setPrice(book.getPrice());
                 userrepo.save(b);

             }
         }
     }
    public void delete(int id)
    {
        userrepo.deleteById(id);
    }
}
