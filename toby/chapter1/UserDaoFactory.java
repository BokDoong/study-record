package com.study.inflearn.toby.chapter1;

public class UserDaoFactory {

    public static UserDao createUserDao() {
        DBConnector H2DBConnector = new H2DBConnector();
        return new UserDao(H2DBConnector);
    }

}
