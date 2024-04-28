/**
 * TODO
 *
 * @Author lzf
 * @Date 2024-04-26 16:39
 **/

package com.book.controller;

import com.book.pojo.Admin;
import com.book.pojo.ReaderCard;
import com.book.service.AdminService;
import com.book.service.ReaderCardService;
import com.book.service.impl.AdminServiceImpl;
import com.book.service.impl.ReaderCardServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(value="/AdminServlet.do")
public class AdminServlet extends HttpServlet {

    AdminService adminService=new AdminServiceImpl();
    ReaderCardService readerCardService=new ReaderCardServiceImpl();

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //System.out.println("Hello.............");
        //1.设置响应乱码
        response.setContentType("text/html;charset=utf-8");
        //2.获取flag的值value值
        String flag =request.getParameter("flag");
        if(flag.equals("login")){
            //管理员登录
            String role =request.getParameter("role");//登录用户角色
            String username =request.getParameter("username");//账号
            String password =request.getParameter("password");//密码
            PrintWriter out = response.getWriter();
            if(role.equals("admin")){

                //封装对象
                Admin admin=new Admin(Integer.valueOf(username),password);
                //调用登录
                Admin loginAdmin =adminService.login(admin);

                if(loginAdmin!=null){
                    //登录成功
                    out.print("<script>alert('登录成功');location.href='/admin/admin_main.html';</script>");

                }else{
                    //登录失败
                    out.print("<script>alert('登录失败，账号或密码错误');location.href='login.html';</script>");
                }
            }else{
                //读者
                ReaderCard readerCard=new ReaderCard();
                readerCard.setReader_id(Integer.valueOf(username));
                readerCard.setPasswd(password);
                ReaderCard loginCard= readerCardService.login(readerCard);
                if(loginCard!=null){
                    //登录成功
                    out.print("<script>alert('登录成功');location.href='/reader/reader_main.html';</script>");
                }else{
                    //登录失败
                    out.print("<script>alert('登录失败，账号或密码错误');location.href='login.html';</script>");
                }
            }

        }


    }
}
