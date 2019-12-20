package xyz.java1024.autoconfigure;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author xivin
 * @email 1250402127@qq.com
 * @description auto configure
 * @date 2019/12/19
 */
/*@Configuration
@ConditionalOnClass(StarterService.class)
@EnableConfigurationProperties(StarterServiceProperties.class)*/
public class StarterAutoConfigure {

    //@Autowired
    private StarterServiceProperties properties;

    @Bean
    @ConditionalOnMissingBean
    //@ConditionalOnProperty(prefix = "java1024.service",havingValue = "enable",value = "true")
    StarterService starterService() {
        return new StarterService(properties.getConfig());
    }
}
