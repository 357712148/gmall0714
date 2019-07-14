package com.javatest.gmall.user.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author liwen406
 * @Title: UserInfo
 * @Description:
 * @date 2019/7/14 / 11:46
 */
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class UserInfo {
    private String id;
    private String login_name;
    private String nick_name;
    private String passwd;
    private String name;
    private String phone_num;
    private String email;
    private String head_img;
    private String user_level;

}
