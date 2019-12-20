package xyz.java1024.autoconfigure;

import org.springframework.util.StringUtils;

/**
 * @author xivin
 * @email 1250402127@qq.com
 * @description starter service
 * @date 2019/12/19
 */
public class StarterService {

    private String config;

    public StarterService(String config) {
        this.config = config;
    }

    public String[] split(String separatorChar) {
        return StringUtils.split(this.config,separatorChar);
    }

}
