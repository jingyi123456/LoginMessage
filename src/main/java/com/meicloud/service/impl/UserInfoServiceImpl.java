package com.meicloud.service.impl;

import com.meicloud.domain.User;
import com.meicloud.service.UserInfoService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

import java.util.List;

/**
 * Created by jingyi on 2018/1/18
 */
@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Override
    public List<User> findAll() {
        User user1 = setUserMessage("zs","男","1960-10-13","13745677654","73455897@163.com","四川成都");
        User user2 = setUserMessage("ls","男","1970-10-13","13247647654","jyzs5897@163.com","湖南长沙");
        User user3 = setUserMessage("wmz","女","1990-01-13","13845677654","734hu897@163.com","广东广州");
        User user4 = setUserMessage("huzq","男","2000-10-21","13745674532","73455897@163.com","福建福州");
        List<User> list = new ArrayList<>();
        list.add(user1);
        list.add(user2);
        list.add(user3);
        list.add(user4);
        return list;
    }

    public List<User> findAllUser() {
        User user1 = setUserMessages("zs","男","1960-10-13","13745677654","73455897@163.com");
        User user2 = setUserMessages("ls","男","1970-10-13","13247647654","jyzs5897@163.com");
        User user3 = setUserMessages("wmz","女","1990-01-13","13845677654","734hu897@163.com");
        User user4 = setUserMessages("huzq","男","2000-10-21","13745674532","73455897@163.com");
        List<User> list = new ArrayList<>();
        list.add(user1);
        list.add(user2);
        list.add(user3);
        list.add(user4);
        return list;
    }

    User setUserMessage(String uname, String sex, String birth,String telephone,String email,String address){
        User user = new User();
        user.setUname(uname);
        user.setSex(sex);
        user.setBirth(birth);
        user.setTelephone(telephone);
        user.setEmail(email);
        user.setAddress(address);
        return user;
    }

    User setUserMessages(String uname, String sex, String birth,String telephone,String email){
        User user = new User();
        user.setUname(uname);
        user.setSex(sex);
        user.setBirth(birth);
        user.setTelephone(telephone);
        user.setEmail(email);
        return user;
    }
}
