package com.journerist.fullstacktdd.manager.interfaces;

import com.journerist.fullstacktdd.hibernate.entity.Player;

import java.util.List;

public interface PlayerGateway {
    int getPlayerCount();

    Player getByName(String name);

    List<Player> getAllPlayer();
}
