package com.example.ex02;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName Hello
 * @Description TODO
 * @Author LST
 * @Date 2023/7/23
 * @Version 1.0
 **/
@RestController
public class Hello {

    @GetMapping("get")
    public String get() {
        return "Hello jenkins";
    }
}
