package com.study.inflearn.toby.chapter1;

public class MySQLDBConnector implements DBConnector {

    @Override
    public void connect() {
        System.out.println("MySQL DB connector connect");
    }

    @Override
    public void flush() {
        System.out.println("MySQL DB connector flush");
    }

    @Override
    public void updateSQL(String sql) {
        System.out.println("MySQL DB connector update sql: " + sql);
    }
}

