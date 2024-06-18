package com.example.Example04;

import jakarta.persistence.*;

// Bước 1: Bên file pom.xml
//Bước 2: Tạo một DB trống trong mysql bằng xampp
//Bước 3: Tạo table, cách tạo như bên dưới, sau đó load lại trên xampp (lúc này DB sẽ có table)
@Entity
@Table(name = "users")
public class User {
    @Id
    private String id;
    private String password;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User() {
    }

    public User(String id, String password) {
        this.id = id;
        this.password = password;
    }
}
