package com.journerist.fullstacktdd.hibernate.entity;

import org.junit.Test;

import java.util.Date;

import static junit.framework.TestCase.assertEquals;

public class PlayerTest {

    @Test
    public void calculateAveragePointsPerGame() throws Exception {
        Player player = new Player("Max", 2, 9, new Date());
        assertEquals(4.5, player.calculateAveragePointsPerGame());
    }
}
