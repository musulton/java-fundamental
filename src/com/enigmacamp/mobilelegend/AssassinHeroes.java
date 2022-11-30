package com.enigmacamp.mobilelegend;

public class AssassinHeroes extends Heroes{
    AssassinHeroes(String name, Integer hp, Integer mana, Integer baseDamage, Integer attackSpeed) {
        super(name, hp, mana, baseDamage, attackSpeed);
        this.baseDamage += 10;
    }
}
