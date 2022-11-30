package com.enigmacamp.mobilelegend;

public class App {
    public static void main(String[] args) {
        Heroes gatotKaca = new Heroes("Gatot", 1000, 1000, 30, 20);
        Heroes saitama = new Heroes( "Saitama", 1000, 1000, 400, 10);
        AssassinHeroes gusion = new AssassinHeroes("Gusion", 800, 1000, 60, 60);
        SupportHeroes rafaela = new SupportHeroes("Rafaela", 1000, 1000, 5, 10);

        saitama.kill(gatotKaca);
        gatotKaca.getKiller();
        gatotKaca.recall();
        gusion.attack(saitama);
        gusion.attack(saitama);
        gusion.attack(saitama);
        System.out.println("Sebelum heal" + saitama);
        rafaela.healHeroes(saitama);

        System.out.println(gatotKaca);
        System.out.println("Setelah heal" + saitama);
    }
}
