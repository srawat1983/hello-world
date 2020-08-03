package com.practice.h2jdbc.example;

import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentRowMapper implements RowMapper<Student> {

    @Override
    public Student mapRow(ResultSet resultSet, int i) throws SQLException {
        Student student = new Student();
        student.setId(resultSet.getString("ID"));
        student.setName(resultSet.getString("NAME"));
        student.setPassportNumber(resultSet.getString("PASSPORT_NUMBER"));
        return student;
    }
}
