package xyz.java1024.vo;

import java.io.Serializable;
import java.util.List;

/**
 * 默认返回格式
 * 
 * {
 *   "code": 0,
 *   "": "",
 *   "count": 1000,
 *   "data": [{}, {}]
 * }
 * 
 */

/**
 * @author xivin
 * @email 1250402127@qq.com
 * @description
 * @date 2019/12/20
 */
public class LayuiResultData<T> implements Serializable {

    private int code;
    private int status;
    private String msg;
    private long total;
    private long count;
    private List<T> data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public long getCount() {
        return count;
    }

    public void setCount(long count) {
        this.count = count;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }
}
