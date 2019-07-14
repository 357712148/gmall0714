package com.javatest.gmall.user.controller;

import com.javatest.gmall.user.pojo.UserInfo;
import com.javatest.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @author liwen406
 * @Title: UserController
 * @Description:
 * @date 2019/7/14 / 11:46
 */
@RestController
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("userInfoList")
    public ResponseEntity<List<UserInfo>> userInfoList(ModelAndView modelAndView) {

        List<UserInfo> userInfoList = userService.userInfoList();

        return ResponseEntity.ok(userInfoList);
    }
}
