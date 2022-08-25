package com.xue.demo.web;

import com.xue.demo.web.transactional.dto.ClassDo;
import org.junit.Test;
import org.springframework.beans.BeanWrapper;
import org.springframework.beans.PropertyAccessorFactory;
import org.springframework.beans.PropertyValue;

/**
 * @author: xuexiong@souche.com
 * @date: 2022/8/22 11:22
 * @description:
 */

public class Demo {
    @Test
    public void test(){
        ClassDo classDemo = new ClassDo();
        BeanWrapper beanWrapper = PropertyAccessorFactory.forBeanPropertyAccess(classDemo);
        beanWrapper.setPropertyValue("className", "一班");
        PropertyValue pv = new PropertyValue("classId", "0001");
        beanWrapper.setPropertyValue(pv);
        System.out.println("classDemo = " + classDemo.getClassId()+"---"+classDemo.getClassName());

    }
}
