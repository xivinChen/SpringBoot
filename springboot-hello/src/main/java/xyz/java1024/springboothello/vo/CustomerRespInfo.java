package xyz.java1024.springboothello.vo;



/**
 * @author ：chenxingwen
 * @version : 1.0
 * @date ：Created in 2020/8/4 18:15
 * @description：
 * @email : 1250402127@qq.com
 */
public class CustomerRespInfo<T> {

    /*{
        "code": 10000,
            "msg": "操作成功",
            "obj ": {
                "appToken": "*************",
                "expires": 7200
            }
    }*/

    private Integer code;
    private String msg;
    private T obj;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }
}
