package com.itheima.pojo;

public class Accessories {

   private Integer aId;
   private String aname ;
   private Integer hp  ;
    private Integer defense ;
    private String aimg  ;
    @Override
    public String toString() {
        return "Accessories{" +
                "aId=" + aId +
                ", aname='" + aname + '\'' +
                ", hp=" + hp +
                ", defense=" + defense +
                ", aimg='" + aimg + '\'' +
                '}';
    }

    public Integer getaId() {
        return aId;
    }

    public void setaId(Integer aId) {
        this.aId = aId;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public Integer getHp() {
        return hp;
    }

    public void setHp(Integer hp) {
        this.hp = hp;
    }

    public Integer getDefense() {
        return defense;
    }

    public void setDefense(Integer defense) {
        this.defense = defense;
    }

    public String getAimg() {
        return aimg;
    }

    public void setAimg(String aimg) {
        this.aimg = aimg;
    }




}
