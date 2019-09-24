package springboot.b2b.shop.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import springboot.b2b.shop.DTO.UserInfo;
import springboot.b2b.shop.DTO.UserPassword;
import springboot.b2b.shop.dao.UserInfoMapper;
import springboot.b2b.shop.dao.UserPasswordMapper;
import springboot.b2b.shop.service.UserService;
import springboot.b2b.shop.service.model.UserModel;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserInfoMapper userInfoMapper;
    @Autowired
    UserPasswordMapper userPasswordMapper;
    @Override
    public UserModel getUserById(Integer id) {
        UserInfo userInfo = userInfoMapper.selectByPrimaryKey(id);
        UserPassword userPassword = null;
        if(StringUtils.isEmpty(userInfo)){
            return null;
        }
        userPassword= userPasswordMapper.selectByUserId(userInfo.getId());

        UserModel userModel = convertFromDataObject(userInfo, userPassword);
        return userModel;
    }

    public UserModel convertFromDataObject(UserInfo userInfo , UserPassword userPassword){
        if(StringUtils.isEmpty(userInfo)){
            return null;
        }
        UserModel userModel =new UserModel();
        BeanUtils.copyProperties(userInfo,userModel);
        if(!StringUtils.isEmpty(userPassword)){
            userModel.setPassword(userPassword.getPassword());
        }
        return  userModel;
    }
}
