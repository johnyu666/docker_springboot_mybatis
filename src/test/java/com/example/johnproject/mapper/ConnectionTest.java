package com.example.johnproject.mapper;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionTest {
    public static void main(String[] args) throws Exception{
        String url="jdbc:mysql://johnyu.cn:3306/scott_bak";
        String driver="com.mysql.cj.jdbc.Driver";
        Connection connection= DriverManager.getConnection(url,"root","123");
        System.out.println(connection);
    }
}
