package com.qf.test;

import com.qf.test.controller.StudentsController;
import com.qf.test.pojo.Students;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;
import java.util.List;

public class TestHomework0731 {
    @Test
    public void test(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        StudentsController studentsController = applicationContext.getBean("studentsController", StudentsController.class);
        List<Students> select = null;
        try {
            select = studentsController.select();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println(select);
    }
}
