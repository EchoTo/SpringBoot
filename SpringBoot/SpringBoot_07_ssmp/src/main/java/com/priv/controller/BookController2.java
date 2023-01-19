package com.priv.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.priv.domain.Book;
import com.priv.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author : 十一
 * @data : 13:31 2023/1/16
 * When in doubt, use brute force.
 */
//@RestController
@RequestMapping("/books")
public class BookController2 {

    @Autowired
    private BookService bookService;

    @GetMapping
    public List<Book> getAll(){
        return bookService.getAll();
    }

    @PostMapping
    public Boolean save(@RequestBody Book book){
        return bookService.save(book);
    }

    @PutMapping
    public Boolean update(@RequestBody Book book){
        return bookService.update(book);
    }

    @DeleteMapping("{id}")
    public Boolean delete(@PathVariable Integer id){
        return bookService.delete(id);
    }

    @GetMapping("{id}")
    public Book getById(@PathVariable Integer id){
        return bookService.getById(id);
    }

    @GetMapping("{currentPage}/{pageSize}")
    public IPage<Book> getPage(@PathVariable int currentPage, @PathVariable int pageSize){
        return bookService.getPage(currentPage, pageSize);
    }
}
