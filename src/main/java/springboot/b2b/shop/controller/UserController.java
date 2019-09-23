package springboot.b2b.shop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import springboot.b2b.shop.DTO.UserInfo;
import springboot.b2b.shop.dao.UserInfoMapper;

import javax.annotation.Resource;


@Controller
public class UserController {

    @Autowired
    private UserInfoMapper userInfoMapper;
    @RequestMapping("/add")
    @ResponseBody
    public String test(){
        UserInfo userInfo = new UserInfo();
        userInfo.setAge(18);
        userInfo.setGender(1);
        userInfo.setId(654);
        userInfo.setName("hehe");
        userInfo.setRegisterMode("PPT");
        userInfo.setTelphone("111111111111");
        userInfo.setThridPartyId("11");
        userInfo.setRegisterMode("weix");
        int insert = userInfoMapper.insert(userInfo);
        return "chengg";
    }
}
