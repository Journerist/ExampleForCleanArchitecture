package com.journerist.exampleForCleanArchitecture.usecases.player.stub;

import com.journerist.exampleForCleanArchitecture.hibernate.entity.Player;
import com.journerist.exampleForCleanArchitecture.manager.interfaces.PlayerGateway;

import java.util.List;

public class InMemoryPlayerGateway implements PlayerGateway {

    List<Player> players;

    public InMemoryPlayerGateway(List<Player> givenPlayers) {
        players = givenPlayers;
    }

    public int getPlayerCount() {
        return 0;
    }

    public Player getByName(String name) {
        return null;
    }

    public List<Player> getAllPlayer() {
        return players;
    }
}
