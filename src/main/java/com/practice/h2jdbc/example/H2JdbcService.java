package com.practice.h2jdbc.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service("h2JdbcService")
public class H2JdbcService {

    Logger LOG = LoggerFactory.getLogger(H2JdbcService.class);

    @Autowired
    JdbcTemplate jdbcTemplate;



    public void getRowsAsString(){
        LOG.info("Printing the datasource...");
        LOG.info(jdbcTemplate.toString());


 LOG.info("Fetching rows as strings");
        SqlRowSet rs=jdbcTemplate.queryForRowSet("select * from student");

        while (rs.next()){
        LOG.info(rs.getString("ID") + "," + rs.getString("NAME") + "," + rs.getString("PASSPORT_NUMBER"));

        }
    }

    public void fetchRowsAsMapList(){

       LOG.info("Fetching rows as pojo mapper");
          List<Map<String,Object>> mapList;
        mapList= jdbcTemplate.queryForList("select * from student");
        for(Map<String,Object> rows:mapList){
            rows.forEach((s, o) ->
                    LOG.info("Columns are - " + s + "," + o.toString()  )
                    );
            }
        }

    public void fetchRowsAsPojo(){

        LOG.info("Fetching rows in pojo using row mapper");
        List<Student> students=jdbcTemplate.query("select * from student",new StudentRowMapper());
        students.forEach(s->
                LOG.info("Student is - " + s.getId() + "\t" + s.getName() + "\t" + s.getPassportNumber())
                );

    }


    }






