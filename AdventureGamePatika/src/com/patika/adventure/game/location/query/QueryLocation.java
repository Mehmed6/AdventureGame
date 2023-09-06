package com.patika.adventure.game.location.query;

import com.patika.adventure.game.character.Player;
import com.patika.adventure.game.location.Location;
import com.patika.adventure.game.location.battle.Cave;
import com.patika.adventure.game.location.battle.Forest;
import com.patika.adventure.game.location.battle.River;
import com.patika.adventure.game.location.normal.ToolStore;
import com.patika.adventure.game.obstacle.ObstacleFactory;

import java.util.Objects;
import java.util.Scanner;

public class QueryLocation {
    public static final Scanner kb = new Scanner(System.in);
    public static void isSaveHouse(Player player, Location location)
    {
        if (location.onLocation()) {

            var newHealthy = switch (player.getName()) {
                case "Okçu" -> 18;
                case "Şovalye" -> 24;
                default -> 21;
            };

            player.setHealthy(newHealthy + player.getInventory().m_armorDefence);
            System.out.println("Güvenli Evde oldugunuz için sağlığınız yenilendi...!");
        }
        else
            System.out.println(player.getName() + " suan bu konumda değil");
    }
    public static void isToolStore(Player player, Location location)
    {
        if (location.onLocation()) {
            var ts = new ToolStore(player, "Magaza");
            ts.menu();
        }
        else
            System.out.println(player.getName() + " suan bu konumda değil");
    }
    public static void isCave(Player player, Location location)
    {
        if (location.onLocation()) {
            var battle = new Cave(player, location.getName());
            System.out.println("Bu Bölgede " + battle.getObstaclesCount() + " Adet Zombi Bulunmaktadır.");
            System.out.println("Kaçmak için (1) - Savaşmak için (2) Giriniz..!");
            var opt = Integer.parseInt(kb.nextLine());

            if (opt == 2)
                battle.combat();
        }
        else
            System.out.println(player.getName() + " suan bu konumda değil");
    }
    public static void isForest(Player player, Location location)
    {
        if (location.onLocation()) {
            var battle = new Forest(player, location.getName());
            System.out.println("Bu Bölgede " + battle.getObstaclesCount() + " Adet Vampir Bulunmaktadır.");
            System.out.println("Kaçmak için (1) - Savaşmak için (2) Giriniz..!");
            var opt = Integer.parseInt(kb.nextLine());

            if (opt == 2)
                battle.combat();
        }
        else
            System.out.println(player.getName() + " suan bu konumda değil");
    }
    public static void isRiver(Player player, Location location)
    {
        if (location.onLocation()) {
            var battle = new River(player, location.getName());
            System.out.println("Bu Bölgede " + battle.getObstaclesCount() + " Adet Ayı Bulunmaktadır.");
            System.out.println("Kaçmak için (1) - Savaşmak için (2) Giriniz..!");
            var opt = Integer.parseInt(kb.nextLine());

            if (opt == 2)
                battle.combat();

        }
        else
            System.out.println(player.getName() + " suan bu konumda değil");
    }


}
