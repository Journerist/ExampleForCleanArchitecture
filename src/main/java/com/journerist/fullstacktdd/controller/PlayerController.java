package com.journerist.fullstacktdd.controller;

import com.journerist.fullstacktdd.hibernate.entity.Player;
import com.journerist.fullstacktdd.manager.HibernatePlayerGateway;
import com.journerist.fullstacktdd.vo.PlayerVO;

public class PlayerController {

    public PlayerVO getPlayerByName(String name) {
        HibernatePlayerGateway pm = new HibernatePlayerGateway();
        Player player = pm.getByName(name);
        return player.toVO();
    }
}
