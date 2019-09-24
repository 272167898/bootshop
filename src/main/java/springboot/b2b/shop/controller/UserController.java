package springboot.b2b.shop.controller;

import org.apache.catalina.User;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import springboot.b2b.shop.DTO.UserInfo;
import springboot.b2b.shop.controller.BaseException.BaseController;
import springboot.b2b.shop.controller.VO.UserVO;
import springboot.b2b.shop.dao.UserInfoMapper;
import springboot.b2b.shop.error.BusinessException;
import springboot.b2b.shop.error.EmBusinessError;
import springboot.b2b.shop.response.CommonResultType;
import springboot.b2b.shop.service.UserService;
import springboot.b2b.shop.service.model.UserModel;

import javax.annotation.Resource;


@Controller
@RequestMapping("/user")
public class UserController extends BaseController {

    @Autowired
    private UserService userService;
    @ResponseBody
    @RequestMapping("/getUser")
    public CommonResultType getUser(@RequestParam("id") Integer id) throws BusinessException {
        UserModel userMode = userService.getUserById(id);
        if (StringUtils.isEmpty(userMode)){
            throw new BusinessException(EmBusinessError.USER_NOT_EXIST);
        }
        UserVO userVO = convertFromModel(userMode);
        return CommonResultType.creat(userVO);
    }

    public UserVO convertFromModel(UserModel userModel){
        if(StringUtils.isEmpty(userModel)){
            return null;
        }
        UserVO userVO = new UserVO();
        BeanUtils.copyProperties(userModel,userVO);
        return userVO;
    }
}
