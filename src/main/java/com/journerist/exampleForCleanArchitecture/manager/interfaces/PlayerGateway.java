package com.journerist.exampleForCleanArchitecture.manager.interfaces;

import com.journerist.exampleForCleanArchitecture.hibernate.entity.Player;

import java.util.List;

public interface PlayerGateway {
    int getPlayerCount();

    Player getByName(String name);

    List<Player> getAllPlayer();
}
