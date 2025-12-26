package com.study.inflearn.toby.chapter1;

public class Client {

    public static void main(String[] args) {

        UserDao userDao = UserDaoFactory.createUserDao();

        User user = new User("이복둥", 28);
        userDao.insertUser(user);
        userDao.deleteUserById(user.getId());

    }

}
