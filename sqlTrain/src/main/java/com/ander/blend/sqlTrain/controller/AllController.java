package com.ander.blend.sqlTrain.controller;

import com.ander.blend.sqlTrain.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/students")
public class AllController {
    @Autowired
    StudentService studentService;











    /**
     * 查询 01 课程比 02 课程成绩高的所有学生的学号
     *
     *
     *
     * 查询思路:
     * 先把学课程 01 的 所有学生 查询出来 模拟成虚拟表 a
     * 在把学课程 02 的 所有学生 查询出来 模拟成虚拟表 b
     * 再从 虚拟表 a,b 中 查询  相同 学生编号 并且 a.score > b.score 的 学生
     *
     * localhost:8080/students/selectOne
     */
    @RequestMapping("/selectOne")
    public ResponseEntity initData() throws Exception {
        return ResponseEntity.ok().body(studentService.selectOne());
    }


}
