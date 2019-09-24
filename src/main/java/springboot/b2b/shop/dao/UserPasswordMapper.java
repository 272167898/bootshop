package springboot.b2b.shop.dao;

import springboot.b2b.shop.DTO.UserPassword;

public interface UserPasswordMapper {

    UserPassword selectByUserId(Integer id);
}