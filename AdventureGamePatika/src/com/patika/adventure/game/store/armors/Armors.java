package com.patika.adventure.game.store.armors;

import com.patika.adventure.game.store.Iventory;

import java.util.Scanner;

public class Armors extends Iventory {
    private static final Scanner kb = new Scanner(System.in);

    public static Armors selectArmors()
    {
        System.out.println("----------------------------------------");
        System.out.println("Zırh | ID | Savunma | Para |");
        infoArmors(new Weak());
        infoArmors(new Middle());
        infoArmors(new Strong());

        System.out.print("Bir Zırh Seçin: ");
        String choice = kb.nextLine();

        switch (choice.toLowerCase()) {
            case "1", "zayıf" -> {
                return new Weak();
            }
            case "2", "orta" -> {
                return new Middle();
            }
            case "3", "güçlü" -> {
                return new Strong();
            }
            default -> {
                System.out.println("Gecersiz Silah Seçimi");
                return null;
            }
        }
    }
    public static void infoArmors(Armors armor)
    {
        System.out.println("---------------------------------------");
        System.out.println(armor.getName() + " | " + armor.getId() + " | " + armor.getDefence() + " | " +
                armor.getPrice() + " | ");
    }
}
