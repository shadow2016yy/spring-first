package com.ryan.www.dao;

import com.ryan.www.dao.mongo.StudentDao;
import com.ryan.www.dto.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * Created by Ryan on 2018/12/4.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentDaoTest {
    @Autowired
    private StudentDao studentDao;

    @Test
    public void testSave() {
        Student student = Student.builder()
                .age(12)
                .country("China")
                .interest("唱歌")
                .name("周杰伦")
                .sex(1)
                .build();
        studentDao.save(student);
    }

    @Test
    public void testFindAll() {
        List<Student> list = studentDao.findAll();
        list.forEach(c -> System.out.println(c));
    }

    @Test
    public void testLoadByName() {
        Student student = studentDao.findByName("周星星");
        System.out.println(student);
    }

    @Test
    public void testLoadByNameLike() {
        List<Student> student = studentDao.findByNameLike("周");
        System.out.println(student);
    }
}
