package com.journerist.exampleForCleanArchitecture.gateway.interfaces;

import com.journerist.exampleForCleanArchitecture.entity.Player;

import java.util.List;

public interface PlayerGateway {
    int getPlayerCount();

    Player getByName(String name);

    List<Player> getAllPlayer();
}
