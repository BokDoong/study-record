package com.study.inflearn.toby.chapter1;

import java.util.HashSet;
import java.util.Set;

public class H2DBConnector implements DBConnector {

    private Set<User> users = new HashSet<>();

    @Override
    public void connect() {
        System.out.println("H2DBConnector connect");
    }

    @Override
    public void flush() {
        System.out.println("H2DBConnector flush");
    }

    @Override
    public void updateSQL(String sql) {
        System.out.println("H2DBConnector updateSQL: " + sql);
    }

}
