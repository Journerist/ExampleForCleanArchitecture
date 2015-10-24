package com.journerist.fullstacktdd.vo;

import com.journerist.fullstacktdd.hibernate.entity.Player;

public class PlayerVO {
    public String username;
    public int playerId;

    public PlayerVO(Player player) {
        this.username = player.getUsername();
        this.playerId = player.getPlayerId();
    }
}
