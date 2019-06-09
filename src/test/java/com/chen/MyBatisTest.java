package com.chen;

import com.chen.domain.Clazz;
import com.chen.domain.Student;
import com.chen.mapper.ClazzMapper;
import com.chen.mapper.StudentMapper;
import com.chen.util.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * @author Chen Dian
 * @date 2019/06/05
 */
public class MyBatisTest {

    @Test
    public void testSelectById() throws IOException {
        SqlSession sqlSession = MyBatisUtils.getSession();
        Student s = sqlSession.selectOne("com.chen.domain.getById",1);
        System.out.println(s);
    }

    @Test
    public void testSelectById2(){
        SqlSession session = MyBatisUtils.getSession();
        StudentMapper mapper = session.getMapper(StudentMapper.class);
        Student student = mapper.getById(1);
        System.out.println(student);
    }



    @Test
    public void testParam(){
        SqlSession session = MyBatisUtils.getSession();
        StudentMapper studentMapper = session.getMapper(StudentMapper.class);
        Student s = studentMapper.getByNameAndAddress("chendian", "hubei");
        System.out.println(s);
    }

    @Test
    public void testAnd(){
        SqlSession session = MyBatisUtils.getSession();
        StudentMapper mapper = session.getMapper(StudentMapper.class);
        List<Student> students = mapper.listAll();
        System.out.println(students);
    }

    @Test
    public void testList(){
        SqlSession session = MyBatisUtils.getSession();
        StudentMapper mapper = session.getMapper(StudentMapper.class);
        List<Student> students = mapper.listAll();
        System.out.println(students);
    }

    @Test
    public void testMap(){
        SqlSession session = MyBatisUtils.getSession();
        Map<Object, Object> listAll = session.selectMap("listAll", "name");
        System.out.println(listAll);
    }

    @Test
    public void testMap2(){
        SqlSession session = MyBatisUtils.getSession();
        StudentMapper mapper = session.getMapper(StudentMapper.class);
        System.out.println(mapper.listAll());
    }

    @Test
    public void tsetCollection(){
        SqlSession session = MyBatisUtils.getSession();
        ClazzMapper mapper = session.getMapper(ClazzMapper.class);
        Clazz clazz = mapper.getById(1);
        System.out.println(clazz.toString());
    }
}
