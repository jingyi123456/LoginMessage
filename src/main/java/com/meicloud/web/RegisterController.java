package com.meicloud.web;

import com.meicloud.domain.Register;
import com.meicloud.domain.User;
import com.meicloud.service.RegisterService;
import com.meicloud.service.UserInfoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by jingyi on 2018/1/18
 */
@Controller
public class RegisterController {

    @Resource
    private RegisterService registerService;
    @Resource
    private UserInfoService userInfoService;

    /*@RequestMapping("findUserByName")
    public ModelAndView findUserByName(HttpServletRequest request, Register register){
        ModelAndView view = new ModelAndView();

        Register register1 = registerService.login(register.getUname());
        if (register1.getUpassword().equals(register.getUpassword())){
            List<User> list = userInfoService.findAll();

            request.getSession().setAttribute("register",register);
            request.getSession().setAttribute("lista",list);

            view.addObject("lista",list);
            view.setViewName("findUserByName");

            return view;
        }

        return null;
    }*/

    @RequestMapping("findUserByName")
    public ModelAndView findByName(HttpServletRequest request, Register register){
        ModelAndView view = new ModelAndView();

        Register register1 = registerService.login(register.getUname());
        if (register1.getUpassword().equals(register.getUpassword())){
            List<User> list = userInfoService.findAllUser();
            request.getSession().setAttribute("register",register);
            request.getSession().setAttribute("lista",list);

            view.addObject("lista",list);
            view.setViewName("findUserByName");
        }

        return null;
    }


    public void print1(String str){
        System.out.println(str);
    }
}
