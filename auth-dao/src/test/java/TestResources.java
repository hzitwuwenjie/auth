import com.hzit.dao.ResourcesDao;
import com.hzit.entity.Resources;
import com.hzit.util.SqlSessionHelper;

import java.util.List;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 　༺༺超༒神༻༻
 * |　@author 深圳合众艾特信息技术有限公司
 * |　@create 2017年08月03日 - 17:35
 * |    @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class TestResources {

    public static void main(String[] args) {
        ResourcesDao dao = SqlSessionHelper.getSqlSession().getMapper(ResourcesDao.class);

        List<Resources> list= dao.findFirstResources();
        for (Resources rs : list){
            System.out.println(rs.getRname());
        }
    }
}
