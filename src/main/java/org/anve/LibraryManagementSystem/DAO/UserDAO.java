package org.anve.LibraryManagementSystem.DAO;

import org.anve.LibraryManagementSystem.Entity.UserEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserDAO
{
    @Autowired
    private SessionFactory sessionFactory;

    public UserEntity getUser(String id){
        Session session = sessionFactory.openSession();
        UserEntity userEntity = (UserEntity ) session.get(UserEntity.class, id);
        return userEntity;
    }

    public List<UserEntity> getAllUsers(){
        Session session = sessionFactory.openSession();
        List<UserEntity> userEntities = session.createQuery("from UserEntity", UserEntity.class).getResultList();
        return userEntities;
    }

    public UserEntity addUser(UserEntity userEntity){
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(userEntity);
        session.getTransaction().commit();
        return userEntity;
    }

    public UserEntity updateUser(UserEntity userEntity){
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.update(userEntity);
        session.getTransaction().commit();
        return userEntity;
    }

    public UserEntity deleteUser(String id){
        Session session = sessionFactory.openSession();
        UserEntity userEntity = (UserEntity ) session.get(UserEntity.class, id);
        session.beginTransaction();
        session.delete(userEntity);
        session.getTransaction().commit();
        return (UserEntity ) session.get(UserEntity.class, id);
    }


}
