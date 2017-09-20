import com.sr.batis.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class )
@ContextConfiguration(value = {"classpath:spring/spring-mybatis.xml", "classpath:batis/SqlMapConfig.xml"})
public class testMapper {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void test1() throws Exception {

        System.out.println(userMapper.findUserById(10));
    }
}