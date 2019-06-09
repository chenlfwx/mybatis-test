package com.chen.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * @author Chen Dian
 * @date 2019/06/08
 */
@Setter
@Getter
@ToString
public class Clazz {
    private Integer id;
    private String name;
    private List<Student> students;
}
