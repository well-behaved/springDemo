package com.xue.demo.web.transactional.service.impl;


import com.xue.demo.web.transactional.dao.ClassDao;
import com.xue.demo.web.transactional.dto.ClassDo;
import com.xue.demo.web.transactional.service.ClassService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Auther: xuexiong@souche.com
 * @Date: 2019/1/16 17:52
 * @Description:
 */
@Data
@Service
public class ClassServiceImpl implements ClassService {
    @Autowired
    private ClassDao classDao;

    @Override
    public int addOne(ClassDo classDo) {
        return classDao.addOne(classDo);
    }

    @Override
    @Transactional()
    public int addOneAnnotation(ClassDo classDo) {
        int num = classDao.addOne(classDo);
        if(1==1){
            throw new RuntimeException("事务回滚测试");
        }
        return num;
    }


}
