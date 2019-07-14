package com.javatest.gmall.user.mapper;

import com.javatest.gmall.user.pojo.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author liwen406
 * @Title: UserInfoMapper
 * @Description:
 * @date 2019/7/14 / 12:00
 */

//@Mapper
public interface UserInfoMapper {


    @Select("SELECT * from user_info ")
    List<UserInfo> findAll();


}
