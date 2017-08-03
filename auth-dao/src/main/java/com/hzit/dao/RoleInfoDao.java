package com.hzit.dao;

import com.hzit.entity.RoleInfo;
import java.util.List;

/**
 * Created by Administrator on 2017/8/3.
 */
public interface RoleInfoDao {
    int addRole(RoleInfo roleInfo);
    int updateRole(RoleInfo roleInfo);
    int deleteRole(Integer roleId);
    List<RoleInfo> findAllRole();
}
