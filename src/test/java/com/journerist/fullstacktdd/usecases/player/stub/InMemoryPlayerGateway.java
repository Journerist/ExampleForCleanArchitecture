package com.journerist.fullstacktdd.usecases.player.stub;

import com.journerist.fullstacktdd.hibernate.entity.Player;
import com.journerist.fullstacktdd.manager.interfaces.PlayerGateway;

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
