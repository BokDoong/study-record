package com.study.inflearn.toby.chapter1;

public class Client {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(UserDaoFactory.class);
        UserDao userDao = context.getBean("userDao", UserDao.class);

        User user = new User("이복둥", 28);
        userDao.insertUser(user);
        userDao.deleteUserById(user.getId());

    }

}
