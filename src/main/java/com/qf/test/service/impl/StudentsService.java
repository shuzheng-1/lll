package com.qf.test.service.impl;

import com.qf.test.dao.IStudentsDao;
import com.qf.test.dao.impl.StudentsDao;
import com.qf.test.pojo.Students;
import com.qf.test.service.IStudentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;
@Service
public class StudentsService implements IStudentsService {
    @Autowired
    private IStudentsDao studentsDao;

    public IStudentsDao getStudentsDao() {
        return studentsDao;
    }

    public void setStudentsDao(IStudentsDao studentsDao) {
        this.studentsDao = studentsDao;
    }

    public List<Students> select() throws SQLException {
       return studentsDao.select();
    }
}
