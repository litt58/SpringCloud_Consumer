package com.jzli.spirng.cloud.consumer.controller;

import com.jzli.spirng.cloud.consumer.fegin.UserFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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
@RestController
public class UserController {
    @Autowired
    private UserFeignClient userFeignClient;

    @RequestMapping(value = "/user/{name}", method = RequestMethod.GET)
    public String getUser(@PathVariable("name") String name) {
        ResponseEntity<String> entity = userFeignClient.getUser(name);
        return entity.getBody();
    }
}
