package springboot.b2b.shop;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit4.SpringRunner;
import springboot.b2b.shop.DTO.UserInfo;
import springboot.b2b.shop.dao.UserInfoMapper;

import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
@ComponentScan("springboot")
public class BootshopApplicationTests {

    @Autowired
    UserInfoMapper userInfoMapper;
    @Test
    public void contextLoads() {
        UserInfo userInfo = new UserInfo();
        Map<Integer,UserInfo>  userInfo1= userInfoMapper.selectByName("hehe");
        System.out.println(userInfo1);
    }

}
