package com.ryan.www.service.impl;

import com.ryan.www.dto.User;
import com.ryan.www.service.UserService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ryan on 2018/9/30.
 */
@Service
public class UserServiceImpl implements UserService {
    @Override
    public List<Object> loadAll() {
        List list = new ArrayList<>();
        list.add(1);
        list.add(11);
        list.add(111);
        return list;
    }

    @Override
    public User handleUeser(User user) {
        user.setName("这个是被操作过的用户");
        return  user;
    }
}
