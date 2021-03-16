package com.company.model;

import com.company.Gender.Gender1;

public class User {
    public int id;
    public String name;
    public int age;
    public Gender1 gender1;


    public User(int id, String name, int age, Gender1 gender1) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender1 = gender1;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender1 getGender1() {
        return gender1;
    }

    public void setGender1(Gender1 gender1) {
        this.gender1 = gender1;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender1=" + gender1 +
                '}';
    }
}
