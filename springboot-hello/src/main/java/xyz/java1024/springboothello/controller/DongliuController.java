package xyz.java1024.springboothello.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import net.dongliu.requests.Requests;
import org.springframework.web.bind.annotation.*;
import xyz.java1024.springboothello.vo.ConstLib;
import xyz.java1024.springboothello.vo.CustomerAccessToken;
import xyz.java1024.springboothello.vo.CustomerCreateParam;
import xyz.java1024.springboothello.vo.CustomerRespInfo;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ：chenxingwen
 * @version : 1.0
 * @date ：Created in 2020/8/5 10:25
 * @description：
 * @email : 1250402127@qq.com
 */
@RestController
@RequestMapping("/dongliu")
public class DongliuController {

    @GetMapping("/token")
    public CustomerRespInfo getAccessToken(String appId,String appKey) {
        HashMap<String, String> params = new HashMap<>(2);
        params.put("appId",appId);
        params.put("appKey",appKey);


        CustomerRespInfo customerRespInfo = Requests.get("http://14.29.166.50:8005/cloud/api/v1//app/getAppToken").params(params).send().readToJson(CustomerRespInfo.class);
        System.out.println("customerRespInfo = " + customerRespInfo.getCode());
        CustomerAccessToken customerAccessToken = JSONObject.parseObject(JSON.toJSONString(customerRespInfo.getObj()), CustomerAccessToken.class);
        System.out.println("customerAccessToken = " + customerAccessToken);
        Map<String,String> obj = (Map) customerRespInfo.getObj();
        System.out.println("obj = " + obj);

        return customerRespInfo;
    }

    @GetMapping("/customer")
    public CustomerRespInfo getCustomer(String accessToken) {

        HashMap<String, String> params = new HashMap<>(2);
        params.put("appToken",accessToken);
        CustomerRespInfo customerRespInfo = Requests.post("https://189dun.com/cloud/api/v1/app/getCustomers").headers(ConstLib.HEADER).params(params).send().readToJson(CustomerRespInfo.class);
        return customerRespInfo;
    }

    @PostMapping("/customer")
    public CustomerRespInfo createCustomer( @RequestBody CustomerCreateParam customerCreateParam) {

        System.out.println(JSONObject.toJSONString(customerCreateParam));


        HashMap<String, String> params = new HashMap<>(2);
        params.put("appToken",customerCreateParam.getAppToken());
        CustomerRespInfo customerRespInfo = Requests.post("https://189dun.com/cloud/api/v1/app/createCustomer/").headers(ConstLib.HEADER).params(params).body(JSONObject.toJSONString(customerCreateParam)).send().readToJson(CustomerRespInfo.class);
        System.out.println("customerRespInfo = " + customerRespInfo);

        return customerRespInfo;
    }
}
