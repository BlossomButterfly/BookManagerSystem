/**
 * TODO
 *
 * @Author lzf
 * @Date 2024-04-26 11:50
 **/

package com.book.dao.impl;


import com.book.dao.AdminDao;
import com.book.pojo.Admin;
import com.book.utils.JDBCUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import java.sql.SQLException;

//实现层加接口层
public class AdminDaoImpl implements AdminDao {

    QueryRunner queryRunner=new QueryRunner(JDBCUtils.getDataSource());

    @Override
    public Admin login(Admin admin) {

        try {
            Admin loginAdmin= queryRunner.query("select * from admin where admin_id=? and password=?",new BeanHandler<Admin>(Admin.class),admin.getAdmin_id(),admin.getPassword());
            return loginAdmin;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
        }
        return null;
    }
}
