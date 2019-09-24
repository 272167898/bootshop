package springboot.b2b.shop.dao;

import org.apache.catalina.User;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import springboot.b2b.shop.DTO.UserInfo;

import java.util.Map;
@Mapper
public interface UserInfoMapper {

    int insert(UserInfo record);

    int insertSelective(UserInfo record);

    UserInfo selectByPrimaryKey(Integer id);
    @MapKey("id")
    Map<Integer,UserInfo> selectByName(String name);
}