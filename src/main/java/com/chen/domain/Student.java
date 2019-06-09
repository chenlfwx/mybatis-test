package com.chen.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.apache.ibatis.type.Alias;

/**
 * @author Chen Dian
 * @date 2019/06/05
 */
@Setter
@Getter
@ToString
@Alias("stu")
public class Student {
    private Integer id;
    private String name;
    private Integer age;
    private String address;
    private Clazz clazz;
}
