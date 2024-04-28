/**
 * TODO
 *
 * @Author lzf
 * @Date 2024-04-26 14:48
 **/

package com.book.utils;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import com.mchange.v2.c3p0.DataSources;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class JDBCUtils {

    //获取c3p0连接对象
    private static ComboPooledDataSource  ds=new ComboPooledDataSource ();
    //获取数据库连接对象
    //SQLException

    public static Connection getConnection() throws SQLException{
        return ds.getConnection();
    }

    //获得C3P0连接池对象
    public static DataSource getDataSource(){
        return ds;
    }
}
