package com.journerist.exampleForCleanArchitecture.manager;

import com.journerist.exampleForCleanArchitecture.entity.Player;
import com.journerist.exampleForCleanArchitecture.hibernate.HibernateSessionManager;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.GregorianCalendar;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class HibernatePlayerGatewayTest {

    private static HibernatePlayerGateway pm;

    @BeforeClass
    public static void setupTestData() throws Exception {
        Session session = HibernateSessionManager.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        Player u1 = new Player("Max", 2, 10, new GregorianCalendar(2010, 1, 1).getTime());
        Player u2 = new Player("Moritz", 3, 9, new GregorianCalendar(2011, 1, 1).getTime());
        Player u3 = new Player("Karl", 1, 3, new GregorianCalendar(2012, 1, 1).getTime());
        session.save(u1);
        session.save(u2);
        session.save(u3);
        tx.commit();
    }

    @BeforeClass
    public static void setUp() throws Exception {
        pm = new HibernatePlayerGateway();
    }

    @Test
    public void playerCount() throws Exception {
        assertEquals(3, pm.getPlayerCount());
    }

    @Test
    public void getByName() throws Exception {
        Player max = pm.getByName("Max");
        assertEquals("Max", max.getUsername());
    }

    @Test
    public void getAllPlayer() throws Exception {
        List<Player> player = pm.getAllPlayer();
        assertEquals(3, player.size());
    }
}
