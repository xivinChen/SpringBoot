package xyz.java1024.springboothello.vo;


/**
 * @author ：chenxingwen
 * @version : 1.0
 * @date ：Created in 2020/8/4 18:23
 * @description：
 * @email : 1250402127@qq.com
 */
public class CustomerAccessToken {

    /*
    "appToken": "*************",
    "expires": 7200
    */

    private String appToken;
    private Integer expires;

    public String getAppToken() {
        return appToken;
    }

    public void setAppToken(String appToken) {
        this.appToken = appToken;
    }

    public Integer getExpires() {
        return expires;
    }

    public void setExpires(Integer expires) {
        this.expires = expires;
    }

    @Override
    public String toString() {
        return "CustomerAccessToken{" +
                "appToken='" + appToken + '\'' +
                ", expires=" + expires +
                '}';
    }
}
