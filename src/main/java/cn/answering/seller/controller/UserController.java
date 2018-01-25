package cn.answering.seller.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by zjp on 2018/1/19.
 * QQ：34948062
 * github: https://www.github.com/zjp1029
 * web： http://www.zjp1029.cn
 */
@Controller
@RequestMapping("/user")
public class UserController {

    /**
     * 用户注册
     */
    @RequestMapping("/register")
    public boolean register(){
        return false;
    }
}
