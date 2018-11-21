package com.ander.blend.filter.filter;

import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * 过滤器
 * <p>
 * <p>
 * 继承 OncePerRequestFilter   spring boot 会自动 注册  不需要在注册  spring mvc 是需要在注册一下的
 */
@Component
public class UserAuthFilter extends OncePerRequestFilter {//继承之后 过滤器 自动 注册

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {

        String[] noFilter = new String[]{
                "/login",
                "/interceptor","/sql",
                "/webC"

        };//不过滤 其他路径都过滤
        boolean doFilter = true;

        String uri = request.getRequestURI();

        for (String s : noFilter) {
            if (uri.indexOf(s) != -1) {
                doFilter = false;
                break;
            }

        }

        HttpSession session = request.getSession();
        Object username = session.getAttribute("username");


        if (doFilter && username == null) {
            System.out.println("你写的路径需要过滤,并且 username ==null  让你跳转到 登录页面");
            response.sendRedirect(request.getContextPath() + "/login");
        } else {
            System.out.println("已经登录 或者 不需要过滤 的路径");
            filterChain.doFilter(request, response);//过滤器执行完毕 执行的路径
        }


    }
}
