package com.priv;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.priv.dao.BookDao;
import com.priv.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBoot07SsmpApplicationTests {

    @Autowired
    public BookDao bookDao;

    @Test
    void contextLoads() {
    }

    @Test
    void testGetBy(){
        QueryWrapper<Book> qw = new QueryWrapper<>();
        qw.like("name", "Spring");
        bookDao.selectList(qw);
    }

    @Test
    void testGetBy2(){
        String name = "Spring";
        LambdaQueryWrapper<Book> qw = new LambdaQueryWrapper<>();
        qw.like(name != null, Book::getName, name);
        bookDao.selectList(qw);
    }

}
