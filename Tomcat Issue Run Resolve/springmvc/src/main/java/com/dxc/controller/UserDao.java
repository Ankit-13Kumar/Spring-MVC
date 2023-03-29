package com.dxc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

//added by me enabletransactionmanagement

@EnableTransactionManagement
@Repository
public class UserDao {
    @Autowired
    private HibernateTemplate hibernateTemplate;


    @Transactional
    public int saveUser(User user){
        int id=(Integer) this.hibernateTemplate.save(user);
        return id;
    }
}
