package com.study.inflearn.toby.chapter1;

public interface DBConnector {

    void connect();

    void updateSQL(String sql);

    void flush();

}
