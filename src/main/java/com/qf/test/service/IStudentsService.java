package com.qf.test.service;

import com.qf.test.pojo.Students;

import java.sql.SQLException;
import java.util.List;

public interface IStudentsService {

    public List<Students> select() throws SQLException;

}
