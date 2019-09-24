package springboot.b2b.shop.error;
//b包装器
public class BusinessException extends Exception implements CommonError {
    private CommonError commonError;
    //直接接受业务异常
    public BusinessException(CommonError commonError) {
        super();
        this.commonError = commonError;
    }
    //自定义的业务异常
    public BusinessException(CommonError commonError,String msg) {
        super();
        this.commonError = commonError;
        this.commonError.setErrmsg(msg);
    }
    @Override
    public int getErrCode() {
        return this.commonError.getErrCode();
    }

    @Override
    public String getErrMsg() {
        return this.commonError.getErrMsg();
    }

    @Override
    public CommonError setErrmsg(String errmsg) {
         this.commonError.setErrmsg(errmsg);
        return this;

    }
}
