import com.hzit.dao.UserInfoDao;
import com.hzit.entity.UserInfo;
import com.hzit.util.SqlSessionHelper;
import com.hzit.vo.UserInfoVo;
import org.apache.ibatis.session.SqlSession;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2017/8/3.
 */
public class TestUserInfo {
    public static void main(String[] args) {
        SqlSession sqlSession= SqlSessionHelper.getSqlSession();
        UserInfoDao userInfoDao=sqlSession.getMapper(UserInfoDao.class);
        // 查询所有用户
/*
            List<UserInfo> userInfoList=userInfoDao.findAllUserByPage(1, 1);
            for(UserInfo user : userInfoList){
                System.out.println(user.toString());
            }
    */
        List<UserInfoVo> userInfoList=userInfoDao.findAllUser();
        for(UserInfoVo user : userInfoList){
            System.out.println(user.toString());
        }
        // 根据用户Id来查找单用户
        /*
            UserInfo user=new UserInfo();
            user.setuId(1);
            user.setuName("吴佳峰");
            user.setuPass("1234567");
            UserInfo userInfo=userInfoDao.findUserById(user);
            System.out.println(userInfo.toString());
        */

        // 增加用户


/*
            UserInfo user=new UserInfo();
            user.setuId(null);
            user.setuName("吴剑");
            user.setuPass("helloworld");
            user.setuStatus("1");
            Date date=new Date();
            SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
            String createTime=simpleDateFormat.format(date);
            user.setCreateTime(createTime);
                int i=userInfoDao.addUser(user);
            if (i==1){
                sqlSession.commit();
                System.out.println("添加成功");
            }else {
                sqlSession.rollback();
                System.out.println("添加失败");
            }
*/

        //修改用户
/*
            UserInfo user=new UserInfo();
            user.setuName("周司机");
            user.setuPass("hehehehe");
            user.setuStatus("0");
            user.setuId(3);
            int i=userInfoDao.updateUser(user);
            if (i==1){
                sqlSession.commit();
                System.out.println("修改成功");
            }else {
                sqlSession.rollback();
                System.out.println("修改失败");
            }
*/

        // 删除用户
/*            int i=userInfoDao.deleteUser(3);
            if (i==1){
                sqlSession.commit();
                System.out.println("删除成功");
            }else {
                sqlSession.rollback();
                System.out.println("删除失败");
            }*/
    }
}
