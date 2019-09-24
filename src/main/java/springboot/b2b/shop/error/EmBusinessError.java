package springboot.b2b.shop.error;

import com.alibaba.druid.wall.violation.ErrorCode;

public enum EmBusinessError implements CommonError {
    //通用异常
    PARAMETER_VALIDATION_ERROR(10001,"参数不合法"),
    //位置异常
    UNKOWN_ERROR(10002,"未知错误"),
    //10000开头的为用户类型的错误
    USER_NOT_EXIST(20001,"用户不存在");
    ;

    private int errCode;
    private String errMsg;

    EmBusinessError(int errCode, String errMsg) {
        this.errCode = errCode;
        this.errMsg = errMsg;
    }

    @Override
    public int getErrCode() {
        return this.errCode;
    }

    @Override
    public String getErrMsg() {
        return this.errMsg;
    }

    @Override
    public CommonError setErrmsg(String errmsg) {
        this.errMsg=errmsg;
        return this;
    }
}
