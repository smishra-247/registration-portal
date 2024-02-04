package com.smishra.app.controller;

import org.springframework.web.bind.annotation.RestController;

import com.smishra.app.Backend.MysqlServer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

class User {

    private String name;
    private String course;
    private int rollno;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return this.course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getRollno() {
        return this.rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    @Override
    public String toString() {
        return "User ( name: " + this.name + ", course: " + this.course + ", Roll No: " + this.rollno + " )";
    }

}

@RestController
public class Register_page {

    @Autowired
    private MysqlServer mysqlServer;

    @PostMapping("/register")
    public String register(@ModelAttribute User user) {
        String name = user.getName();
        String course = user.getCourse();
        int rollNo = user.getRollno();

        if (name.length() > 49){
            return "<h2 align='center'>The name is too long to insert data!</h2>";
        }
        if (!((course.equals("BCA")) || (course.equals("MCA")) || (course.equals("BSC")))) {
            return "<h2 align='center'>Data Tempering detected, Can not process your data!</h2>";
        }

        if(mysqlServer.userExists(course, rollNo)) {
            return "<h2 align='center'>User already exists!</h2>";
        }

        int result = mysqlServer.insertData(name, course, rollNo);

        if (result == 1) {
            return "<h3 align='center'>Successfully uploaded to database</h3><br>" + user.toString();
        } else {
            return "<h2 align='center'>Sorry, I got an error!</h2>";
        }

    }
    
}
