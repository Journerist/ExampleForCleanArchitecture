package com.journerist.exampleForCleanArchitecture;

import com.journerist.exampleForCleanArchitecture.hibernate.entity.*;

import java.util.List;

import com.journerist.exampleForCleanArchitecture.hibernate.HibernateSessionManager;
import org.hibernate.Criteria;
import org.hibernate.Session;

public class Main {

    public static void main(String[] args) {

        Session session = HibernateSessionManager.getSessionFactory().openSession();

        Criteria criteria = session.createCriteria(Player.class);
        List<Player> list = criteria.list();

        System.out.print("user count: " + list.size());

    }
}
