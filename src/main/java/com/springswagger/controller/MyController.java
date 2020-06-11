package com.springswagger.controller;

import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description
 * @ClassName MySwaggerController
 * @Author User
 * @date 2020.06.11 22:14
 */
@RestController
@RequestMapping("api/v1")
@Api(value = "测试接口", tags = "UserController", description = "测试接口相关")
public class MyController {

    @GetMapping("/")
    @ApiOperation(value = "访问网站首页", notes = "网站首页")
    public void index() {

    }

    @GetMapping(value = "/mi", produces = "application/json")
    @ApiImplicitParam(name = "num", value = "数字", required = true, dataType = "int", paramType = "query")
    @ApiOperation(value = "获取用户详细信息", notes = "根据id来获取用户详细信息")
    public int getUser(@RequestParam int num) {
        return num*num;
    }
}