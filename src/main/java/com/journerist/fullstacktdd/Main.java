package com.journerist.fullstacktdd;

import com.journerist.fullstacktdd.hibernate.entity.*;

import java.util.List;

import com.journerist.fullstacktdd.hibernate.HibernateSessionManager;
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
