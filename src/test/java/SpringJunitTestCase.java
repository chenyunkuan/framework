import com.kuange.framework.model.SysUser;
import com.kuange.framework.service.SysUserService;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


/**
 * Created by Administrator on 2015/8/15 0015.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/spring.xml", "classpath:spring/spring-servlet.xml","classpath:spring/spring-mybatis.xml"})
public abstract class SpringJunitTestCase {

}
