package com.study.inflearn.toby.chapter1;

@Configuration
public class UserDaoFactory {

    @Bean
    public UserDao userDao() {
        return new UserDao(dbConnector());
    }

    @Bean
    public DBConnector dbConnector() {
        return new H2DBConnector();
    }

}
