package com.priv.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.priv.dao.BookDao;
import com.priv.domain.Book;
import com.priv.service.IBookService;
import org.springframework.stereotype.Service;

/**
 * @author : 十一
 * @data : 13:27 2023/1/16
 * When in doubt, use brute force.
 */
@Service
public class BookServicePlus extends ServiceImpl<BookDao, Book> implements IBookService {
}
