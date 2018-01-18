package com.meicloud.service.impl;

import com.meicloud.domain.Register;
import com.meicloud.service.RegisterService;
import org.springframework.stereotype.Service;

/**
 * Created by jingyi on 2018/1/18
 */
@Service
public class RegisterServiceImpl implements RegisterService {

    @Override
    public Register login(String uname) {
        Register register1 = new Register();
        register1.setUname("jingyi");
        register1.setUpassword("123");

        if (register1.getUname().equals(uname)){
            return register1;
        }

        return null;
    }
}
