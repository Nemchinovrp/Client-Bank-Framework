package com.becomejavasenior.mvc.repository;


import com.becomejavasenior.mvc.model.Account;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class AccountRepository {
    static final Logger logger = LogManager.getRootLogger();

    private static final String QUERY_SELECT_ALL = "from Account";

    @Autowired
    private SessionFactory sessionFactory;

    @Transactional
    public void createAccount(Account account) {
        Session session = sessionFactory.getCurrentSession();
        session.save(account);
        logger.info("Account save");
    }

    @Transactional
    public List<Account> getAllAccount() {
        Session session = sessionFactory.getCurrentSession();
        List accounts = session.createQuery(QUERY_SELECT_ALL).list();
        return accounts;
    }

    @Transactional
    public void updateAccount(Account account) {
        Session session = sessionFactory.getCurrentSession();
        session.update(account);
        logger.info("Account update");
    }

    @Transactional
    public Account getAccountById(int id) {
        Session session = sessionFactory.getCurrentSession();
        Account account = (Account) session.load(Account.class, new Integer(id));
        return account;
    }

    @Transactional
    public void deleteAccount(int id) {
        Session session = sessionFactory.getCurrentSession();
        Account account = (Account) session.load(Account.class, new Integer(id));
        if (null != account) {
            session.delete(account);
        }
        logger.info("User delete");
    }
}
