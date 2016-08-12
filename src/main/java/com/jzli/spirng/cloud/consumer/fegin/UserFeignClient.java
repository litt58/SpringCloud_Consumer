package com.jzli.spirng.cloud.consumer.fegin;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
@FeignClient("user-service")
public interface UserFeignClient {

    @RequestMapping(value = "/user/{name}", method = RequestMethod.GET)
    ResponseEntity<String> getUser(@PathVariable("name") String name);
}
