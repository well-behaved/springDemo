package com.xue.demo.web.transactional.dao;


import com.xue.demo.web.transactional.dto.ClassDo;

/**
 * @Auther: xuexiong@souche.com
 * @Date: 2019/1/16 17:43
 * @Description:
 */
public interface ClassDao {
    /**
     * 添加一个
     * @return
     */
    int addOne(ClassDo classDo);
}
