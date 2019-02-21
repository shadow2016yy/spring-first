package com.ryan.www.service;

import com.ryan.www.dto.User;

import java.util.List;

/**
 * Created by Ryan on 2018/9/30.
 */
public interface UserService {
    /**
     * 查询所有
     * @return
     */
    List<Object> loadAll();

    User  handleUeser(User user);
}
