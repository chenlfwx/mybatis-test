package com.chen.mapper;

import com.chen.domain.Student;
import org.apache.ibatis.annotations.Select;

/**
 * @author Chen Dian
 * @date 2019/06/05
 */
public interface StudentAnnotationMapper {
    @Select("SELECT * FROM student WHERE id = #{id}")
    Student getById(Integer id);
}
