package com.priv.dao.impl;

import com.priv.dao.BookDao;
import org.springframework.stereotype.Repository;

/**
 * @author : 十一
 * @data : 13:27 2023/1/6
 * When in doubt, use brute force.
 */
@Repository
public class BookDaoImpl implements BookDao {
    @Override
    public void save() {
        System.out.println("book dao is running ...");
    }
}
