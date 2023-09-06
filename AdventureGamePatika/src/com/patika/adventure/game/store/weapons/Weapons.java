package com.patika.adventure.game.store.weapons;

import com.patika.adventure.game.store.Iventory;

import java.util.Scanner;

public class Weapons extends Iventory {
    private static final Scanner kb = new Scanner(System.in);

    public static Weapons selectWeapons()
    {
        System.out.println("----------------------------------------");
        System.out.println("Silah | ID | Hasar | Para |");
        infoWeapons(new Gun());
        infoWeapons(new Sword());
        infoWeapons(new Rifle());

        System.out.print("Bir Silah Seçin: ");
        String choice = kb.nextLine();

        switch (choice.toLowerCase()) {
            case "1", "tabanca" -> {
                return new Gun();
            }
            case "2", "kılıç" -> {
                return new Sword();
            }
            case "3", "tüfek" -> {
                return new Rifle();
            }
            default -> {
                System.out.println("Gecersiz Silah Seçimi");
                return null;
            }
        }
    }
    public static void infoWeapons(Weapons weapons)
    {
        System.out.println("---------------------------------------");
        System.out.println(weapons.getName() + " | " + weapons.getId() + " | " + weapons.getDamage() + " | " +
                weapons.getPrice() + " | ");
    }
}
