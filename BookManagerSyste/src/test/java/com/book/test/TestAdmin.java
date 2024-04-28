/**
 * TODO
 *
 * @Author lzf
 * @Date 2024-04-26 15:20
 **/

package com.book.test;

import com.book.dao.AdminDao;
import com.book.dao.impl.AdminDaoImpl;
import com.book.pojo.Admin;
import org.junit.Test;

public class TestAdmin {

    AdminDao dao=new AdminDaoImpl();//多态

    @Test
    public void testLogin(){
        Admin admin=new Admin(2385056,"Aa@2385056");
        Admin login=dao.login(admin);
        if(login!=null){
            System.out.println("登录成功");
        }else{
            System.out.println("登录失败");
        }
    }

}
