package com.hzit.dao;

import com.hzit.entity.UserInfo;
import com.hzit.vo.UserInfoVo;

import java.util.List;

/**
 * Created by Administrator on 2017/8/3.
 */
public interface UserInfoDao {
    int addUser(UserInfo userInfo);
    int updateUser(UserInfo userInfo);
    int deleteUser(Integer userId);
    List<UserInfo> findAllUserByPage(Integer startRow,Integer count);
    List<UserInfoVo> findAllUser();
    UserInfo findUserById(UserInfo userInfo);
}
