package com.ander.blend.filter.interceptors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/interceptor")
public class URITestController {

    @GetMapping("/")
    public Integer interceptor() {

        System.out.println("调用 controller 里的 interceptor 方法 执行逻辑");

        return 1;
    }
    @GetMapping("/test")
    public Integer test() {

        System.out.println("调用 controller 里的 test  方法 执行逻辑");

        return 1;
    }


}
