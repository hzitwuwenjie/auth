package com.hzit.dao;

import com.hzit.entity.UserInfo;

import java.util.List;

/**
 * Created by Administrator on 2017/8/3.
 */
public interface UserInfoDao {
    int addUser(UserInfo userInfo);
    int updateUser(UserInfo userInfo);
    int deleteUser(Integer userId);
    List<UserInfo> findAllUser();
    UserInfo findUserById(Integer userId);
}
