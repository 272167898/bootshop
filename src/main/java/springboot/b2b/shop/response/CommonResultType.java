package springboot.b2b.shop.response;

public class CommonResultType {

    private String state;
    private Object data;

    public static CommonResultType creat(Object data){
       return creat("success",data);
    }
    public static CommonResultType creat(String state,Object data){
        CommonResultType type = new CommonResultType();
        type.setState(state);
        type.setData(data);
        return type;
    }
    public String getState() {
        return state;
    }

    public void setState(String statu) {
        this.state = statu;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
