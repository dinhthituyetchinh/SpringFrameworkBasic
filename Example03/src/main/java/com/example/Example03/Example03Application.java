package com.example.Example03;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
public class Example03Application {

	public static void main(String[] args) {

//		Bước 5: Run project và xem port sau đó qua web gõ: localhost:[post][/đường dẫn nếu có ở bước 4]
//		Như trong project này là: localhost:8080/hello
		SpringApplication.run(Example03Application.class, args);
	}

}
