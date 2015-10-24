package com.journerist.fullstacktdd.hibernate.entity;


import com.journerist.fullstacktdd.vo.PlayerVO;

import java.io.Serializable;
import java.util.Date;

public class Player implements Serializable {

    public Player() {

    }

    public Player(String username, int gameCount, int points, Date createdDate) {
        this.username = username;
        this.points = points;
        this.gameCount = gameCount;
        this.createdDate = createdDate;
    }

    private int playerId;
    private String username;
    private int points;
    private int gameCount;
    private Date createdDate;

    public int getPlayerId() {
        return playerId;
    }
    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public int getPoints() {
        return points;
    }
    public void setPoints(int points) {
        this.points = points;
    }
    public Date getCreatedDate() {
        return createdDate;
    }
    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public int getGameCount() {
        return gameCount;
    }

    public void setGameCount(int gameCount) {
        this.gameCount = gameCount;
    }

    public double calculateAveragePointsPerGame() {
        return ((double) getPoints())/ getGameCount();
    }

    public PlayerVO toVO() {
        return new PlayerVO(this);
    }
}