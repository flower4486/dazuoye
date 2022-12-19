package com.itheima.pojo;

public class Weapon {
    private Integer  wId     ;
    private String   wname   ;
    private Integer  attack  ;
    private String   wimg    ;

    @Override
    public String toString() {
        return "Weapon{" +
                "wId=" + wId +
                ", wname='" + wname + '\'' +
                ", attack=" + attack +
                ", wimg='" + wimg + '\'' +
                '}';
    }

    public Integer getwId() {
        return wId;
    }

    public void setwId(Integer wId) {
        this.wId = wId;
    }

    public String getWname() {
        return wname;
    }

    public void setWname(String wname) {
        this.wname = wname;
    }

    public Integer getAttack() {
        return attack;
    }

    public void setAttack(Integer attack) {
        this.attack = attack;
    }

    public String getWimg() {
        return wimg;
    }

    public void setWimg(String wimg) {
        this.wimg = wimg;
    }
}
