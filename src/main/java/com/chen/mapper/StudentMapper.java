package com.chen.mapper;

import com.chen.domain.Student;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @author Chen Dian
 * @date 2019/06/05
 */
public interface StudentMapper {
    Student getById(Integer id);

    Student getByNameAndAddress(@Param("sname") String name, @Param("address") String address);

    // 测试#{}和${}
    Student getByName(@Param("name") String name,@Param("id") Integer id,@Param("tableName") String tableName);

    @MapKey("name")
    Map<Integer,Student> getMap();

    List<Student> listAll();
}
