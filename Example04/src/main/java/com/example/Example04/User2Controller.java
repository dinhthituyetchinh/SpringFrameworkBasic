package com.example.Example04;

import com.example.Example04.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class User2Controller {
    @GetMapping("/user2/form")
    public String showForm(Model model) {
        model.addAttribute("user2", new User());
        return "user2/login";
    }

    @PostMapping("/user2/login")
    public String login(@ModelAttribute("user") User user, Model model) {
        String id = user.getId();
        String pw = user.getPassword();

        if ("admin".equals(id) && "tuyetchinh".equals(pw)) {
            model.addAttribute("uid", id);
            model.addAttribute("pwd", pw);
            return "user2/info";
        } else {
            model.addAttribute("mess", "Sai thông tin đăng nhập");
            return "user2/login";
        }
    }
}
