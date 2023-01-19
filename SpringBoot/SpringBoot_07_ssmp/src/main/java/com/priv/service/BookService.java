package com.priv.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.priv.domain.Book;

import java.util.List;

/**
 * @author : 十一
 * @data : 12:55 2023/1/16
 * When in doubt, use brute force.
 */
public interface BookService {
    Boolean save(Book book);

    Boolean update(Book book);

    Boolean delete(Integer id);

    Book getById(Integer id);

    List<Book> getAll();

    IPage<Book> getPage(int currentPage, int pageSize);

    IPage<Book> getPage(int currentPage, int pageSize, Book book);
}
