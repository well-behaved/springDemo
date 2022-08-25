package com.xue.demo.web.transactional.controllers;

import com.xue.demo.web.transactional.dto.ClassDo;
import com.xue.demo.web.transactional.service.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

/**
 * @author: xuexiong@souche.com
 * @date: 2021/9/2 20:00
 * @description:
 */
@RestController
public class DemoController {
    @Autowired
    private ClassService classService;

    /**
     * 添加一个
     * @return
     */
    @GetMapping("/hello123")
    public int addOne() {
        ClassDo demoDo = new ClassDo();
        demoDo.setClassId(new Random().nextInt(1000)+"");
        demoDo.setClassName("班级名和曾呢");
        return classService.addOneAnnotation(demoDo);
    }

    /**
     * 添加一个
     * @return
     */
    @GetMapping("/demo11")
    public String demo11() {
      return "123123123";
    }
}
