/**
 * TODO
 *
 * @Author lzf
 * @Date 2024-04-28 17:21
 **/

package com.book.dao.impl;

import com.book.dao.ReaderCardDao;
import com.book.pojo.Admin;
import com.book.pojo.ReaderCard;
import com.book.utils.JDBCUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import java.sql.SQLException;

public class ReaderCardDaoImpl implements ReaderCardDao {

    QueryRunner queryRunner=new QueryRunner(JDBCUtils.getDataSource());
    @Override
    public ReaderCard login(ReaderCard card) {
        try {
            return queryRunner.query("select * from reader_card where reader_id=? and passwd=? and card_state=1",new BeanHandler<ReaderCard>(ReaderCard.class),card.getReader_id(),card.getPasswd());
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
        }
        return null;

    }
}
