package com.patika.adventure.game;

import com.patika.adventure.game.character.Player;
import com.patika.adventure.game.location.LocationFactory;

import java.util.Objects;

public class GameApp {
    public static void run()
    {
        Game.m_player = Player.selectCharacter();
        var player = Game.m_player;

        while (Game.m_player != null && Game.m_player.getHealthy() != 0) {
            Game.m_location = LocationFactory.creatLocation(Game.m_player);

            if (Game.m_location.getName().equals("quit"))
                break;

            Game.start();
            if (player.getInventory().m_water && player.getInventory().m_food && player.getInventory().m_firewood) {
                System.out.println("******** Tebrikler..! ********" + "\n" +
                                   "Oyundaki Bütün Elementleri Toplayarak Oyunu Bitirdin..! ");
                break;
            }

        }

    }
}
