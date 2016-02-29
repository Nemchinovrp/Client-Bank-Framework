package com.becomejavasenior.mvc.repository;

import com.becomejavasenior.mvc.model.Transaction;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class TransactionRepository {
    static final Logger logger = LogManager.getRootLogger();

    private static final String QUERY_SELECT_ALL = "from Transaction";

    @Autowired
    private SessionFactory sessionFactory;

    @Transactional
    public void createTransaction(Transaction transaction) {
        Session session = sessionFactory.getCurrentSession();
        session.save(transaction);
        logger.info("Transaction save");
    }

    @Transactional
    public List<Transaction> getAllTransaction() {
        Session session = sessionFactory.getCurrentSession();
        List transactions = session.createQuery(QUERY_SELECT_ALL).list();
        return transactions;
    }

    @Transactional
    public void updateTransaction(Transaction transaction) {
        Session session = sessionFactory.getCurrentSession();
        session.update(transaction);
        logger.info("Transaction update");
    }

    @Transactional
    public Transaction getTransactionById(int id) {
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = (Transaction) session.load(Transaction.class, new Integer(id));
        return transaction;
    }

    @Transactional
    public void deleteTransaction(int id) {
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = (Transaction) session.load(Transaction.class, new Integer(id));
        if (null != transaction) {
            session.delete(transaction);
        }
        logger.info("User delete");
    }
}
