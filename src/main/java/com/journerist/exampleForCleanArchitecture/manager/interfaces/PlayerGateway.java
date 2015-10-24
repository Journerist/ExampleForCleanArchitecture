package com.journerist.exampleForCleanArchitecture.manager.interfaces;

import com.journerist.exampleForCleanArchitecture.entity.Player;

import java.util.List;

public interface PlayerGateway {
    int getPlayerCount();

    Player getByName(String name);

    List<Player> getAllPlayer();
}
