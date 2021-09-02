package com.xue.demo.web.transactional.dao.impl;


import com.xue.demo.web.transactional.dao.ClassDao;
import com.xue.demo.web.transactional.dto.ClassDo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * @Auther: xuexiong@souche.com
 * @Date: 2019/1/16 17:52
 * @Description:
 */
@Repository
public class ClassDaoImpl implements ClassDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int addOne(ClassDo classDo) {
        String sql = "insert into class(CLASS_ID,CLASS_NAME) values(?,?)";
        return jdbcTemplate.update(sql, classDo.getClassId(), classDo.getClassName());
    }
}
