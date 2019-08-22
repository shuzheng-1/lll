package com.qf.test.dao.impl;

import com.qf.test.dao.IStudentsDao;
import com.qf.test.pojo.Students;
import com.qf.test.util.MyPool;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.springframework.stereotype.Component;

import java.sql.SQLException;
import java.util.List;
@Component
public class StudentsDao implements IStudentsDao {
    @Override
    public List<Students> select() throws SQLException {
        QueryRunner qr = new QueryRunner(MyPool.getDatasource());
        String sql = "select * from students";
        List<Students> stu = qr.query(sql,new BeanListHandler<Students>(Students.class));
        return  stu;
    }
}
