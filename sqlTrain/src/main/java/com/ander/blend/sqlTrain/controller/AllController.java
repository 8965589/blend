package com.ander.blend.sqlTrain.controller;

import com.ander.blend.sqlTrain.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/sql")
public class AllController {

    @Autowired
    StudentService studentService;

    /**
     * 查询出没有学习 张三老师课程的 学生的学号和姓名
     * 先根据 老师和课程表 求出老师的课程编号,然后去 课程与学生的映射中 筛选即可
     */

    @GetMapping("/findNoZS")
    public ResponseEntity findNoZS() {
        Map<String, String> map = new HashMap();
        map.put("tName", "张三");
        return ResponseEntity.ok().body(studentService.findNoZS(map));
    }


    //=====================================

    /**
     * 查询姓“李”的老师的个数；
     */


    @GetMapping("/findLi")
    public ResponseEntity findLi() {
        return ResponseEntity.ok().body(studentService.findLi());
    }

//=====================================

    /**
     * 查询所有同学的学号、姓名、选课数、总成绩；
     * <p>
     * 先求 选课数 和 总成绩  count sum/avg  然后 在和 同学表 关联 ok
     * <p>
     * 两张表的操作 先用leftjoin  关联成一张虚拟表  再 把 要求的 相同数值 拿出来分组
     */

    @GetMapping("/selectSan")
    public ResponseEntity selectSan() {
        return ResponseEntity.ok().body(studentService.selectSan());
    }


    /**
     * 查询出平均成绩大于60的 同学的学号和 平均成绩
     * <p>
     * 函数 可以写在  select的 后边 也可以当作查询条件
     * <p>
     * group by 是  给 行 分组
     * having 是  给  分组后的 分组  在  分组
     * <p>
     * 相同条件分为一组
     * <p>
     * 所以 能 select的 只是 这个  条件列  或者 经过 函数处理过的 某个值
     * <p>
     * select sc.Snum,---每一组的相同条件
     * AVG(sc.score)  avg_score  -- 函数  求出某个值
     * <p>
     * from sc
     * <p>
     * group by sc.Snum  ---按这个条件分组
     * HAVING AVG(sc.score) >60----分组后再过滤
     */
    @RequestMapping("/selectAvg")
    public ResponseEntity selectAvg() {

        return ResponseEntity.ok().body(studentService.selectAvg());
    }

//=====================================

    /**
     * 查询 01 课程比 02 课程成绩高的所有学生的学号
     * <p>
     * <p>
     * <p>
     * 查询思路:
     * 先把学课程 01 的 所有学生 查询出来 模拟成虚拟表 a
     * 在把学课程 02 的 所有学生 查询出来 模拟成虚拟表 b
     * 再从 虚拟表 a,b 中 查询  相同 学生编号 并且 a.score > b.score 的 学生
     * <p>
     * localhost:8080/students/selectOne
     */
    @RequestMapping("/selectOne")
    public ResponseEntity initData() throws Exception {
        return ResponseEntity.ok().body(studentService.selectOne());
    }


}
