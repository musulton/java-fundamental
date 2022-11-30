package com.enigmacamp.mobilelegend;

public class Heroes implements HitAble {
    protected Integer hp;
    protected Integer mana;
    protected Integer baseDamage;
    private Integer attackSpeed;
    public String name;
    private String killer;

    public Heroes(String name, Integer hp, Integer mana, Integer baseDamage, Integer attackSpeed) {
        this.name = name;
        this.hp = hp;
        this.mana = mana;
        this.baseDamage = baseDamage;
        this.attackSpeed = attackSpeed;
    }

    @Override
    public void getHit(Integer damage) {
        this.hp -= damage;
    }

    void attack(HitAble hitAble) {
        hitAble.getHit(this.baseDamage);
    }

    void setHp(Integer hp) {
        this.hp = hp;
    }

    void heal(Integer hp, Integer mana) {
        setHp(hp);
        this.mana = mana;
    }

    void dead() {
        this.hp = 0;
        this.mana = 0;
    }

    void kill(Heroes heroes) {
        heroes.dead();
        heroes.killer = this.name;
    }

    void getKiller() {
        System.out.println("Anda telah dibunuh oleh " + killer);
    }

    void recall() {
        this.heal(1000, 1000);
    }

    @Override
    public String toString() {
        return "Heroes{" +
                "hp=" + hp +
                ", mana=" + mana +
                ", baseDamage=" + baseDamage +
                ", attackSpeed=" + attackSpeed +
                '}';
    }
}
