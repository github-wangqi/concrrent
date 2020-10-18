package com.hnmqet.service;

import com.hnmqet.entity.AccountMainEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;


@Service
public class ConcurrentService {

    @Autowired
    private ConcurrentRepository concurrentDao;

    @Transactional
    public void update(Long id,Double count) {
        AccountMainEntity old = concurrentDao.lockById(id).get();
        BigDecimal countDecimal = new BigDecimal(String.valueOf(count));
        old.setBalance(countDecimal.add(old.getBalance()));
        concurrentDao.save(old);
    }
}
