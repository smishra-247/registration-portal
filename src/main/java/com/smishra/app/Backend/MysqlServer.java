package com.smishra.app.Backend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class MysqlServer {
    final String INSERT_DATA = "INSERT INTO Student(name, course, rollNo) VALUES(?, ?, ?)";

    final String CHECK_VALUE = "SELECT CASE WHEN EXISTS (SELECT 1 FROM Student WHERE course = ? AND rollNo = ?) THEN true ELSE false END"; 
    // Todo - To add some new string for fetching values;

    @Autowired
    JdbcTemplate jdbcTemplate;

    // Todo -
    // To Modify a user data
    // To delete a user from database

    public boolean userExists(String course, int rollNo){
        boolean result = jdbcTemplate.queryForObject(CHECK_VALUE, Boolean.class, course, rollNo);
        return result;
    }

    public int insertData(String name, String course, int rollNo){
        int result = this.jdbcTemplate.update(INSERT_DATA, new Object[]{name, course, rollNo});
        return result;
    }
}
