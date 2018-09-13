package com.ceh.swaggerui.swaggerui.controller;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by enHui.Chen on 2018/9/13.
 */
@Api(value = "api")
@RestController
@RequestMapping("/api")
public class SwaggerController {

    @RequestMapping(value = "/swaggerOne", method = RequestMethod.GET)
    @ApiOperation(value = "测试one", httpMethod = "GET", notes = "just for test one", response = ResponseEntity.class)
    public ResponseEntity<String> swaggerOne(String str1, String str2) {
        return new ResponseEntity<>(str1 + str2, HttpStatus.OK);
    }
}
