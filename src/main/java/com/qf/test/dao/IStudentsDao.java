package com.qf.test.dao;

import com.qf.test.pojo.Students;

import java.sql.SQLException;
import java.util.List;

public interface IStudentsDao {

    public List<Students> select() throws SQLException;

}
