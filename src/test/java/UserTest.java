import com.kuange.framework.model.SysUser;
import com.kuange.framework.service.SysUserService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Administrator on 2015/8/16 0016.
 */
public class UserTest extends  SpringJunitTestCase {

    @Autowired
    SysUserService sysUserService;

    @Test
    public void testSelectByPrimaryKey(){
        System.out.println("hello,world");
    }
}
