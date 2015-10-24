package com.journerist.exampleForCleanArchitecture.entity.vo;

import com.journerist.exampleForCleanArchitecture.entity.Player;

public class PlayerVO {
    public String username;
    public int playerId;

    public PlayerVO(Player player) {
        this.username = player.getUsername();
        this.playerId = player.getPlayerId();
    }
}
