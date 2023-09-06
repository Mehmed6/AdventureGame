package com.patika.adventure.game;


import com.patika.adventure.game.character.Player;
import com.patika.adventure.game.location.Location;
import com.patika.adventure.game.location.query.QueryLocation;


public class Game {
    public static Player m_player;
    public static Location m_location;

    public Game(Player player, Location location)
    {
        m_player = player;
        m_location = location;
    }

    public static void start()
    {
        switch (m_location.getName().toLowerCase()) {
            case "güvenli ev", "safehouse" -> QueryLocation.isSaveHouse(m_player, m_location);
            case "magaza", "toolstore" -> QueryLocation.isToolStore(m_player, m_location);
            case "orman", "forest" -> QueryLocation.isForest(m_player, m_location);
            case "magara", "cave" -> QueryLocation.isCave(m_player, m_location);
            case "nehir",  "river" -> QueryLocation.isRiver(m_player, m_location);

        }
        System.out.println("Karakterin Istatistikleri: ");
        Player.infoCharacter(m_player);
        System.out.println("---------------------------------------");
        System.out.println("Sectiğiniz Karakterde Bulunan Envanterler: ");
        System.out.println(m_player.getInventory());
        System.out.println("----------------------------------------");

    }
}
