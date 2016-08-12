package com.jzli.spirng.cloud.consumer;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * =======================================================
 *
 * @Company 金色家网络科技有限公司-开发测试云服务部
 * @Date ：2016/8/5
 * @Author ：li.jinzhao
 * @Version ：0.0.1
 * @Description ：
 * ========================================================
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class Application {
    public static void main(String[] args) {
        new SpringApplicationBuilder(Application.class).web(true).run(args);
    }
}
