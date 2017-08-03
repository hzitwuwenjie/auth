import com.hzit.dao.ResourcesDao;
import com.hzit.util.SqlSessionHelper;

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
        ResourcesDao dao= SqlSessionHelper.getSqlSession().getMapper(ResourcesDao.class);

        dao.findResourcesByUser(1);


    }
}
