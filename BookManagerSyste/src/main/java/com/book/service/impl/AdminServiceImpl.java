/**
 * TODO
 *
 * @Author lzf
 * @Date 2024-04-26 16:34
 **/

package com.book.service.impl;

import com.book.dao.AdminDao;
import com.book.dao.impl.AdminDaoImpl;
import com.book.pojo.Admin;
import com.book.service.AdminService;

public class AdminServiceImpl implements AdminService {
    AdminDao adminDao=new AdminDaoImpl();

    @Override
    public Admin login(Admin admin){
        return adminDao.login(admin);
    }

}
