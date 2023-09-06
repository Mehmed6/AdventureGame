package com.patika.adventure.game.location;

import com.patika.adventure.game.character.Player;
import com.patika.adventure.game.location.battle.Cave;
import com.patika.adventure.game.location.battle.Forest;
import com.patika.adventure.game.location.battle.River;
import com.patika.adventure.game.location.normal.SaveHouse;
import com.patika.adventure.game.location.normal.ToolStore;

import java.util.Scanner;

public class LocationFactory {
    private static final Scanner kb = new Scanner(System.in);
    public static Location creatLocation(Player player)
    {
        System.out.println("Nereye Gitmek istersiniz? (Sayı Şeklinde Giriniz:)");
        System.out.println("---------------------------------------");
        System.out.println("Güvenli Ev için -> '0'");
        System.out.println("Magaza için -> '1'");
        System.out.println("Orman için -> '2'");
        System.out.println("Magara için -> '3'");
        System.out.println("Nehir için -> '4'");
        System.out.println("Oyundan çıkmak için (Q) yada (-1) giriniz..!");
        System.out.println("---------------------------------------");

        var opt = kb.nextLine();

        switch (opt.toLowerCase()) {
            case "0", "güvenli ev"-> {
                return new SaveHouse(player,"Güvenli Ev");
            }
            case "1", "magaza" -> {
                return new ToolStore(player,"Magaza");
            }
            case "2", "orman" -> {
                return new Forest(player, "Orman");
                }
            case "3", "magara" -> {
                return new Cave(player,"Magara");
            }
            case "4", "nehir" -> {
                return new River(player, "Nehir");
            }
            case "-1", "q" -> {
                System.out.println("Oyundan Çıkılıyor..!");

                return new Location(player, "quit") {
                    @Override
                    public boolean onLocation()
                    {
                        return false;
                    }
                };
            }
            default -> {
                System.out.println("Gecersiz Lokasyon!..");
                return null;
            }
        }
    }
}
