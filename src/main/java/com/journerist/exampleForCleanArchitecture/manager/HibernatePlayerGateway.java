package com.journerist.exampleForCleanArchitecture.manager;

import com.journerist.exampleForCleanArchitecture.entity.Player;
import com.journerist.exampleForCleanArchitecture.hibernate.HibernateSessionManager;
import com.journerist.exampleForCleanArchitecture.manager.interfaces.PlayerGateway;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import java.util.List;

/**
 * User operation manager for fetching data
 */
public class HibernatePlayerGateway implements PlayerGateway {

    public int getPlayerCount() {
        Session session = HibernateSessionManager.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();

        Criteria criteria = session.createCriteria(Player.class);
        int size = criteria.list().size();

        tx.commit();

        return size;
    }

    public Player getByName(String name) {
        Session session = HibernateSessionManager.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();

        Criteria criteria = session.createCriteria(Player.class);
        criteria.add(Restrictions.eq("username", name));
        List<Player> result = criteria.list();
        tx.commit();

        return result.get(0);
    }

    public List<Player> getAllPlayer() {
        Session session = HibernateSessionManager.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();

        Criteria criteria = session.createCriteria(Player.class);
        List<Player> result = criteria.list();
        tx.commit();

        return result;
    }
}
