package com.journerist.fullstacktdd.usecases.player;

import com.journerist.fullstacktdd.hibernate.entity.Player;
import com.journerist.fullstacktdd.manager.interfaces.PlayerGateway;

import java.util.List;

public class PlayerLeagueUseCase {

    private final PlayerGateway pm;

    public PlayerLeagueUseCase(PlayerGateway inMemoryPlayerManager) {
        pm = inMemoryPlayerManager;
    }

    public int calculateRank(Player p) {
        List<Player> allPlayer = pm.getAllPlayer();

        int rank = 1;
        for( Player otherPlayer : allPlayer) {
            if(!otherPlayer.equals(p)) {
                if(p.getPoints() < otherPlayer.getPoints()) {
                    rank++;
                }
            }
        }

        return rank;
    }
}
