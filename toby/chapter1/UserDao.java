package com.study.inflearn.toby.chapter1;

public class UserDao {

    private DBConnector dbConnector;

    public UserDao(DBConnector dbConnector) {
        this.dbConnector = dbConnector;
    }

    public void insertUser(User user) {

        // DB 연결
        connectDB();

        // 유저 삽입
        dbConnector.updateSQL(String.format(
                "insert into user (name, age) values ('%s', %d)",
                user.getName(),
                user.getAge()
        ));

        // DB 연결 해제
        flushToDB();

    }

    public void deleteUserById(Long id) {

        // DB 연결
        connectDB();

        // 유저 삭제
        dbConnector.updateSQL("delete from user where id = " + id);

        // DB 연결 해제
        flushToDB();

    }

    private void connectDB() {
        dbConnector.connect();
    }

    private void flushToDB() {
        dbConnector.flush();
    }

}
