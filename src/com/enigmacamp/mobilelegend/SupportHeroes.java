package com.enigmacamp.mobilelegend;

public class SupportHeroes extends Heroes {
    SupportHeroes(String name, Integer hp, Integer mana, Integer baseDamage, Integer attackSpeed) {
        super(name, hp, mana, baseDamage, attackSpeed);
    }

    void healHeroes(Heroes heroes) {
        if (this.mana > 0) {
            if (heroes.hp <= 1000) {
                heroes.setHp(1000);
                System.out.println(heroes.name + " hp sudah penuh");
            } else {
                System.out.println("Hp sudah penuh");
            }
        } else {
            System.out.println("Mana tidak cukup");
        }
    }
}
