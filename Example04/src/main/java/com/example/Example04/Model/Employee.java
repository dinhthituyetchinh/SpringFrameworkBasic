package com.example.Example04.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "employees")
public class Employee {
 public int id;
 public String fullname;
 public Department department;
 public Duty duty;
}
