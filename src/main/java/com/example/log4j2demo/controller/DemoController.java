package com.example.log4j2demo.controller;

import cn.hutool.json.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yanWenPing
 * @date 2021/12/10
 */
@Slf4j
@RestController
@RequestMapping("smallbow")
public class DemoController {

    @PostMapping("test")
    public JSONObject test(@RequestBody JSONObject reqJson) {
        log.info("test");


        if (null == reqJson || reqJson.isEmpty()) {
            JSONObject jsonObject = new JSONObject();
            jsonObject.set("param1", "param1");

            return jsonObject;
        }
        return reqJson;
     }
}
