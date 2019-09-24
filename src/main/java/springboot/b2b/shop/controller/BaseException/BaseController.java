package springboot.b2b.shop.controller.BaseException;

import org.springframework.http.HttpRequest;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import springboot.b2b.shop.error.BusinessException;
import springboot.b2b.shop.error.EmBusinessError;
import springboot.b2b.shop.response.CommonResultType;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

public class BaseController {
    @ExceptionHandler
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public Object HandleException(HttpServletRequest request , Exception ex){
        Map<String,Object> responseMap = new HashMap<>();
        if(ex instanceof BusinessException){
            BusinessException businessException =(BusinessException)ex;
            responseMap.put("errorCode",businessException.getErrCode());
            responseMap.put("errorMsg",businessException.getErrMsg());
        }else{
            responseMap.put("errorCode", EmBusinessError.USER_NOT_EXIST.getErrCode());
            responseMap.put("errorMsg",EmBusinessError.USER_NOT_EXIST.getErrMsg());
        }
        return CommonResultType.creat("fail",responseMap);
    }
}
