package springboot.b2b.shop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springboot.b2b.shop.DTO.UserInfo;
import springboot.b2b.shop.dao.UserInfoMapper;
import springboot.b2b.shop.service.model.UserModel;

public interface UserService {

    public UserModel getUserById(Integer id) ;
}
