package com.ander.blend.aspectJ.aspect;


import com.alibaba.fastjson.JSON;
import com.ander.blend.aspectJ.annotation.SysLogAnnotation;
import com.ander.blend.aspectJ.domain.SysLog;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 一个切面对应一个自定义注解
 * 在切面类中 把 注解 赋值上
 * 同时 传入一个 service  做一些 这个 注解要做的事
 *
 *
 * AOP编程其实是很简单的事情，纵观AOP编程，程序员只需要参与三个部分：
 *
 * 1、定义普通业务组件
 *
 * 2、定义切入点，一个切入点可能横切多个业务组件
 *
 * 3、定义增强处理，增强处理就是在AOP框架为普通业务组件织入的处理动作
 *
 * <p>
 * <p>
 * execution(public * *(..)):任意public方法
 * execution(* set*(..)):方法名以set开头的任意方法
 * execution(* com.xyz.service.AccountService.*(..))：AccountService 接口下的任意方法
 * execution(* com.xyz.service..(..))：service包下的任意方法
 * execution(* com.xyz.service...(..))：service包或子包下的任意方法
 * execution(public void MyClass.myMethod(String)) :MyClass 类的myMethod方法,方法public访问权限,void返回值,形参只有一个并为String类型
 * execution(void MyClass.myMethod(..)):MyClass 类的myMethod方法,任意访问权限,返回值void,任意形参
 * execution(* MyClass.myMethod(..)):MyClass 类的myMethod方法,任意返回值,任意形参
 * execution(* MyClass.myMethod*(..)):MyClass 类的以myMethod开头的方法,任意返回值,任意形参
 * execution(* MyClass.myMethod*(String,..)):MyClass 类的以myMethod开头的方法,任意返回值,第一个形参类型是String
 * execution(* *.myMethod(..)):任意类下myMethod方法 execution(MyClass.new()):任意MyClass类的无参构造器
 * execution(MyClass.new(..)):任意MyClass类的任意有参构造器 execution(MyClass+.new(..)):任意MyClass或其子类构造器
 * execution(public * com.mycompany..*.*(..)):com.mycompany包下任意子包的所有类的所有public 方法
 */
@Aspect //声明此类是一个切面类
@Component //没有分类的类
public class SysLogAspect {
    @Autowired
    private SysLogService logService;

    /**
     * 第一种方式
     * 切入点
     * 第一种方式  在 controller  方法上！！！ 添加 @SysLogAnnotation("测试注解") 就可以 直接 调用执行了
     * 没有在方法上 添加注解 是不触发 切面的

     @Pointcut("@annotation(com.ander.annotation.SysLogAnnotation)") public void logPointCut() {

     }


     */
    /**
     * 第二种方式  使用  表达式
     *
     * SysLogService 下的所有方法  都 是切入点
     */
    @Pointcut("execution(* com.ander.service.*.*(..))")
    public void logPointCut() {

    }

    //对加强点的操作
    @Around("logPointCut()")
    public Object around(ProceedingJoinPoint point) throws Throwable {
        long startTime = System.currentTimeMillis();

        Object result = point.proceed();
        long time = System.currentTimeMillis() - startTime;

        try {
            saveLog(point, time);
        } catch (Exception e) {

        }


        return result;
    }

    private void saveLog(ProceedingJoinPoint point, long time) {


        //方法署名
        MethodSignature methodSignature = (MethodSignature) point.getSignature();
        Method method = methodSignature.getMethod();

        SysLog sysLog = new SysLog();

        sysLog.setExeuTime(time);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        sysLog.setCreateDate(dateFormat.format(new Date()));

        SysLogAnnotation sysLogAnnotation = method.getAnnotation(SysLogAnnotation.class);

        if (sysLogAnnotation != null) {
            sysLog.setRemark(sysLogAnnotation.value());
        }
        //增强点 类名
        String pointClassName = point.getTarget().getClass().getName();
        //增强点 方法名
        String pointMethodName = methodSignature.getName();
        sysLog.setClassName(pointClassName);
        sysLog.setMethodName(pointMethodName);

        Object[] args = point.getArgs();
        try {
            List<String> list = new ArrayList<String>();
            for (Object o : args) {
                list.add(JSON.toJSON(o).toString());
            }
            sysLog.setParams(list.toString());


        } catch (Exception e) {

        }

        logService.save(sysLog);


    }

}
