package com.meicloud.service;

import com.meicloud.domain.User;

import java.util.List;

/**
 * Created by jingyi on 2018/1/18
 */
public interface UserInfoService {

    List<User> findAll();

    List<User> findAllUser();
}
