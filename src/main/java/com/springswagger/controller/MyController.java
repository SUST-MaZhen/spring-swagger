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
    public String index() {
        return "welcome";
    }

    @GetMapping(value = "/mi", produces = "application/json")
    @ApiImplicitParam(name = "num", value = "数字", required = true, dataType = "int", paramType = "query")
    @ApiOperation(value = "求一个数的平方", notes = "求一个数的平方的运算")
    public int getNum2(@RequestParam int num) {
        return num*num;
    }
}