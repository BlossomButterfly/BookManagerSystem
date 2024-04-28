/**
 * TODO
 *
 * @Author lzf
 * @Date 2024-04-28 17:36
 **/

package com.book.service.impl;

import com.book.dao.ReaderCardDao;
import com.book.dao.impl.ReaderCardDaoImpl;
import com.book.pojo.ReaderCard;
import com.book.service.ReaderCardService;

public class ReaderCardServiceImpl implements ReaderCardService {

    ReaderCardDao readerCardDao=new ReaderCardDaoImpl();
    @Override
    public ReaderCard login(ReaderCard card) {
        return readerCardDao.login(card);
    }
}
