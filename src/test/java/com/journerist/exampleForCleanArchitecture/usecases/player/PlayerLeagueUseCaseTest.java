package com.journerist.exampleForCleanArchitecture.usecases.player;

import com.journerist.exampleForCleanArchitecture.hibernate.entity.Player;
import com.journerist.exampleForCleanArchitecture.usecases.player.stub.InMemoryPlayerGateway;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static junit.framework.Assert.assertEquals;

public class PlayerLeagueUseCaseTest {

    private static PlayerLeagueUseCase uc;

    @BeforeClass
    public static void setUp() throws Exception {
        List<Player> players = new ArrayList<Player>();
        players.add(new Player("P5", 1, 16, new Date()));
        players.add(new Player("P4", 1, 8, new Date()));
        players.add(new Player("P3", 1, 4, new Date()));
        players.add(new Player("P2", 1, 2, new Date()));
        players.add(new Player("P1", 1, 1, new Date()));
        uc = new PlayerLeagueUseCase(new InMemoryPlayerGateway(players));
    }

    @Test
    public void calculateSimpleRank() throws Exception {
        Player p = new Player("max", 1, 5, new Date());
        assertEquals(3, uc.calculateRank(p));
    }

    @Test
    public void calculateRankWithPlayerThatHasEqualPoints() throws Exception {
        Player p = new Player("max", 1, 8, new Date());
        assertEquals(2, uc.calculateRank(p));
    }
}
