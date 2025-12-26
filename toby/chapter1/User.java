package com.study.inflearn.toby.chapter1;

import lombok.Getter;
import lombok.Setter;

import java.util.Random;

@Getter
@Setter
public class User {

    private Long id;

    private String name;

    private int age;

    public User(String name, int age) {
        this.id = new Random().nextLong();
        this.name = name;
        this.age = age;
    }

}
