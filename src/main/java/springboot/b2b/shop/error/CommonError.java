package springboot.b2b.shop.error;

public interface CommonError {
    public int getErrCode();
    public String getErrMsg();
    public CommonError setErrmsg(String errmsg);

}
