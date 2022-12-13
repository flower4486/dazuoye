package com.itheima.pojo;

public class Weapon {
    private String wId     ;
    private String wname   ;
    private int attack  ;
    private String wimg    ;

    @Override
    public String toString() {
        return "Weapon{" +
                "wId='" + wId + '\'' +
                ", wname='" + wname + '\'' +
                ", attack=" + attack +
                ", wimg='" + wimg + '\'' +
                '}';
    }

    public String getwId() {
        return wId;
    }

    public void setwId(String wId) {
        this.wId = wId;
    }

    public String getWname() {
        return wname;
    }

    public void setWname(String wname) {
        this.wname = wname;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public String getWimg() {
        return wimg;
    }

    public void setWimg(String wimg) {
        this.wimg = wimg;
    }
}
