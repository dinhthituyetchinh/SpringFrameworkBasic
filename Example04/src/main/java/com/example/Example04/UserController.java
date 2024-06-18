package com.example.Example04;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {
    @RequestMapping(value = "/user/form", method = RequestMethod.GET)
    public String showForm() {
        return "user/login";
    }

    @RequestMapping(value = "/user/login", method = RequestMethod.POST)
    public String login(HttpServletRequest request) {
        String id = request.getParameter("id");
        String pw = request.getParameter("password");

        if ("admin".equals(id) && "tuyetchinh".equals(pw)) {
            request.setAttribute("uid", id);
            request.setAttribute("pwd", pw);
            return "user/info";
        } else {
            request.setAttribute("mess", "Sai thông tin đăng nhập");
            return "user/login";
        }
    }
}
