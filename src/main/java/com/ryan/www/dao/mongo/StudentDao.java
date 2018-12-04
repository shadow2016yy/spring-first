package com.ryan.www.dao.mongo;

import com.ryan.www.dto.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * Created by Ryan on 2018/12/4.
 */
public interface StudentDao extends MongoRepository<Student, String> {
    /**
     * 自定义搜索 find + By + 字段  首字母大写
     * @param name
     * @return
     */
    Student findByName(String name);

    /**
     * 自定义搜索 find + By + 字段  首字母大写 +Like
     * @param name
     * @return
     */
    List<Student> findByNameLike(String name);
}
