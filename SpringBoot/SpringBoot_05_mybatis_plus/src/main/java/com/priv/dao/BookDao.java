package com.priv.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.priv.domain.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @author : 十一
 * @data : 14:18 2023/1/6
 * When in doubt, use brute force.
 */
@Mapper
public interface BookDao extends BaseMapper<Book> {

}
