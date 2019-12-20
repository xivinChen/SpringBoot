package xyz.java1024.autoconfigure;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author xivin
 * @email 1250402127@qq.com
 * @description properties
 * @date 2019/12/19
 */

@ConfigurationProperties(prefix = "java1024.service")
public class StarterServiceProperties {

    private String config;

    public String getConfig() {
        return config;
    }

    public void setConfig(String config) {
        this.config = config;
    }
}
