package com.xue.demo.web.transactional.service;


import com.xue.demo.web.transactional.dto.ClassDo;

/**
 * @Auther: xuexiong@souche.com
 * @Date: 2019/1/16 17:44
 * @Description:
 */
public interface ClassService {
    /**
     * 添加一个
     * @return
     */
    int addOne(ClassDo classDo);
    /**
     * 添加一个
     * @return
     */
    int addOneAnnotation(ClassDo classDo);
}
