package com.journerist.exampleForCleanArchitecture.controller;

import com.journerist.exampleForCleanArchitecture.hibernate.entity.Player;
import com.journerist.exampleForCleanArchitecture.manager.HibernatePlayerGateway;
import com.journerist.exampleForCleanArchitecture.vo.PlayerVO;

public class PlayerController {

    public PlayerVO getPlayerByName(String name) {
        HibernatePlayerGateway pm = new HibernatePlayerGateway();
        Player player = pm.getByName(name);
        return player.toVO();
    }
}
