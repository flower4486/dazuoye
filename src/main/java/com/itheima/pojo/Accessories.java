package com.itheima.pojo;

public class Accessories {
   private String aId;
   private String aname ;
   private int hp  ;
   private int defense ;
   private String aimg  ;

    @Override
    public String toString() {
        return "Accessories{" +
                "aId='" + aId + '\'' +
                ", aname='" + aname + '\'' +
                ", hp=" + hp +
                ", defense=" + defense +
                ", aimg='" + aimg + '\'' +
                '}';
    }

    public String getaId() {
        return aId;
    }

    public void setaId(String aId) {
        this.aId = aId;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public String getAimg() {
        return aimg;
    }

    public void setAimg(String aimg) {
        this.aimg = aimg;
    }
}
