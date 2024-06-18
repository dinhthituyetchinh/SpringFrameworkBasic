package com.example.Example03;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
//Bước 1: Sau khi tạo project với Spring Boot thì tạo một class Controller
//Bước 2: Gõ @RestController
@RestController
public class HelloController {
//    Bước 4: Gõ  @GetMapping("/hello")
    @GetMapping("/hello")
//    Bước 3: Viết hàm
    public String sayHello()
    {
        return "Hello World";
    }
}
//Bước 5: Bên file main, file chạy project