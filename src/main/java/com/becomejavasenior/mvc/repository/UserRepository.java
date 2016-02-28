package com.becomejavasenior.mvc.repository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.becomejavasenior.mvc.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class UserRepository {
    static final Logger logger = LogManager.getRootLogger();

    private static final String QUERY_SELECT_ALL = "from User";

    @Autowired
    private SessionFactory sessionFactory;

    @Transactional
    public void createUser(User user) {
        Session session = sessionFactory.getCurrentSession();
        session.save(user);
        logger.info("User save");
    }

    @Transactional
    public List<User> getAllUser() {
        Session session = sessionFactory.getCurrentSession();
        List users = session.createQuery(QUERY_SELECT_ALL).list();
        return users;
    }

    @Transactional
    public void updateUser(User user) {
        Session session = sessionFactory.getCurrentSession();
        session.update(user);
        logger.info("User update");
    }

    @Transactional
    public User getUserById(int id) {
        Session session = sessionFactory.getCurrentSession();
        User user = (User) session.load(User.class, new Integer(id));
        return user;
    }

    @Transactional
    public void deleteUser(int id) {
        Session session = sessionFactory.getCurrentSession();
        User user = (User) session.load(User.class, new Integer(id));
        if (null != user) {
            session.delete(user);
        }
        logger.info("User delete");
    }
}
