package com.qf.test.controller;

import com.qf.test.pojo.Students;
import com.qf.test.service.IStudentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.sql.SQLException;
import java.util.List;
@Controller
public class StudentsController {
    @Autowired
    private IStudentsService studentsService;

    public IStudentsService getStudentsService() {
        return studentsService;
    }

    public void setStudentsService(IStudentsService studentsService) {
        this.studentsService = studentsService;
    }

    public List<Students> select() throws SQLException {
        return studentsService.select();
    }

}
