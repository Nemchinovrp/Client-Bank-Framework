package com.becomejavasenior.mvc.dao.daoImpl;

import com.becomejavasenior.mvc.dao.UserDao;
import com.becomejavasenior.mvc.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@SuppressWarnings({"unchecked", "rawtypes"})
public class UserDaoImpl{
    private static final String QUERY_SELECT_ALL = "from User";

    @Autowired
    private SessionFactory sessionFactory;

  /*  @Override
    public User createUser(User user) {
        return null;
    }*/

    @Transactional
    public List<User> getAllUser() {
        Session session = sessionFactory.getCurrentSession();
        List users = session.createQuery(QUERY_SELECT_ALL).list();
        return users;
    }

   /* @Override
    public User getUserById(int id) {
        return null;
    }

    @Override
    public void updateUser(User user) {

    }

    @Override
    public void deleteUser(int id) {

    }*/
}
