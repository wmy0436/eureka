package com.schj.eurekaconsumer.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Ribbon 负载均衡配置类
 * 规定：这个类不能再@ComponentScan和@SpringBootApplication本包和子包下，否则引起@RibbonClients扫描冲突
 *注意：随机第一次打断点进入，之后多次刷新就不进入，可能由于本地缓存原因
 *
 */
@Configuration
public class RibbonRuleConfig {

    /**
     * Ribbon 配置随机访问
     * @return
     */
    @Bean
    public IRule ribbonRule(){
        return  new RandomRule();
    }

}
