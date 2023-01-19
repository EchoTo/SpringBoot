package com.priv.domain;

import lombok.Data;

/**
 * @author : 十一
 * @data : 10:15 2023/1/14
 * When in doubt, use brute force.
 */
@Data
public class Book {
    private Integer id;
    private String type;
    private String name;
    private String description;
}
