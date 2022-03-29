package com.example.sbbooks;

import com.example.sbbooks.book.Book;
import com.example.sbbooks.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class JdbcController
{
    @Autowired
    UserService userService;

    @GetMapping("/book")
    private List<Book> getAllBooks()
    {
        return userService.getAllBooks();
    }

    @GetMapping("/book/{id}")
    private  Book getBook(@PathVariable("id") int id)
    {
        return userService.getBookById(id);
    }

    @DeleteMapping("/book/{id}")
    private void deleteBook(@PathVariable("id") int id)
    {
        userService.delete(id);
    }
    @PostMapping("/book")
    private int saveUser(@RequestBody Book book)
    {
        userService.saveOrUpdate(book);
        return book.getId();
    }
    @PostMapping("/book")
    private int saveLibBook(@RequestBody Book book)
    {

        userService.saveOrUpdate(book);

        return book.getId();
    }
}
