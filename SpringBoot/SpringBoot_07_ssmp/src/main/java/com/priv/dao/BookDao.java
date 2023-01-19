package com.priv.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.priv.domain.Book;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author : 十一
 * @data : 10:21 2023/1/14
 * When in doubt, use brute force.
 */
@Mapper
public interface BookDao extends BaseMapper<Book> {
}
