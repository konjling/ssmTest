package com.wdd.service;

import com.wdd.bean.User;
import com.wdd.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class UserService {
    @Autowired
    UserMapper userMapper;
    public List<User> getAll(){
        return userMapper.selectByExampleWithDept(null);
    }

    public List<Map<String,Object>> getJobInfo(){
        return userMapper.searchJobInfo();
    }
}
