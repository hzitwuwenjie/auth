import com.hzit.dao.RoleInfoDao;
import com.hzit.dao.UserInfoDao;
import com.hzit.entity.RoleInfo;
import com.hzit.entity.UserInfo;
import com.hzit.util.SqlSessionHelper;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * Created by Administrator on 2017/8/3.
 */
public class TestRoleInfo {
    public static void main(String[] args) {
        SqlSession sqlSession= SqlSessionHelper.getSqlSession();
        RoleInfoDao roleInfoDao=sqlSession.getMapper(RoleInfoDao.class);
        // 查询所有角色

            List<RoleInfo> roleInfoList=roleInfoDao.findAllRole();
            for(RoleInfo roleInfo : roleInfoList){
                System.out.println(roleInfo.toString());
            }

        // 增加角色
/*

            RoleInfo roleInfo=new RoleInfo();
            roleInfo.setrId(5);
            roleInfo.setrName("技术经理");
            int i=roleInfoDao.addRole(roleInfo);
            if (i==1){
                sqlSession.commit();
                System.out.println("添加成功");
            }else {
                sqlSession.rollback();
                System.out.println("添加失败");
            }

*/

        //修改角色名
/*
            RoleInfo roleInfo=new RoleInfo();
            roleInfo.setrName("技术总监");
            roleInfo.setrId(5);
            int i= roleInfoDao.updateRole(roleInfo);
            if (i==1){
                sqlSession.commit();
                System.out.println("修改成功");
            }else {
                sqlSession.rollback();
                System.out.println("修改失败");
            }
*/

        // 删除角色
/*            int i=roleInfoDao.deleteRole(5);
            if (i==1){
                sqlSession.commit();
                System.out.println("删除成功");
            }else {
                sqlSession.rollback();
                System.out.println("删除失败");
            }
*/
    }
}
