package com.example.Example04;

import com.example.Example04.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class User3Controller {

    @Autowired
    UserRepository userRepository;

    @GetMapping("/user3/register")
    public String showRegisterForm(Model model) {
        model.addAttribute("user3", new User());
        return "user3/register";
    }

    @PostMapping("/user3/register")
    public String register(@ModelAttribute("user3") User user, Model model) {
        String id = user.getId();
        String pw = user.getPassword();

        if (userRepository.existsById(id)) {
            model.addAttribute("mess", "ID đã tồn tại");
            return "user3/register";
        } else {
            User newUser = new User(id, pw);
            userRepository.save(newUser);

            model.addAttribute("mess", "Đăng ký thành công");
            return "user3/login";
        }
    }


    @GetMapping("/user3/form")
    public String showForm(Model model) {
        model.addAttribute("user3", new User());
        return "user3/login";
    }

    @PostMapping("/user3/login")
    public String login(@ModelAttribute("user3") User user, Model model) {
        String id = user.getId();
        String pw = user.getPassword();

        if (userRepository.existsById(id) && userRepository.findById(id).get().getPassword().equals(pw)) {
            model.addAttribute("uid", id);
            model.addAttribute("pwd", pw);
            return "user3/info";
        } else {
            model.addAttribute("mess", "Sai thông tin đăng nhập");
            return "user3/login";
        }
    }

}
