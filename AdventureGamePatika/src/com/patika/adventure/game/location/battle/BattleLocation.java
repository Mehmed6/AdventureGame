package com.patika.adventure.game.location.battle;

import com.patika.adventure.game.character.Player;
import com.patika.adventure.game.location.Location;
import com.patika.adventure.game.obstacle.Obstacle;
import com.patika.adventure.game.obstacle.ObstacleFactory;

public abstract class BattleLocation extends Location {
    private final Obstacle[] m_obstacles = ObstacleFactory.creatObstacle(getName());
    public BattleLocation(Player player, String name)
    {
        super(player, name);
    }

    public int getObstaclesCount()
    {
        assert m_obstacles != null;
        return m_obstacles.length;
    }

    public void combat()
    {
        if (m_obstacles == null) {
            System.out.println("Canavar(Combat) için Null hatası");
            return;
        }

        var obsNum = m_obstacles.length;

        for (var i = 0; i < obsNum; ++i) {

            while (0 < m_obstacles[i].getHealthy() && 0 < getPlayer().getHealthy()) {
                fight(i);
               // System.out.println(getPlayer().getHealthy());

            }

            if (getPlayer().getHealthy() <= 0) {
                System.out.println("Oyuncu Hayatını Kaybetti..!");
                break;
            }
            else {
                getPlayer().setMoney(getPlayer().getMoney() + m_obstacles[i].getMoney());
                getInventory(getName());
            }
        }
        if (getPlayer().getHealthy() != 0)
              System.out.println("Savaş Kazanıldı..! Başlangıç Noktasına Dönülüyor..!");
    }
    private void fight(int n)
    {
        if (m_obstacles == null) {
            System.out.println("Canavar(Fight) için Null hatası");
            return;
        }

        var obstacle = m_obstacles[n];
        obstacle.setHealthy(obstacle.getHealthy() - getPlayer().getDamage());

        if (obstacle.getHealthy() > 0) {
            getPlayer().setHealthy(getPlayer().getHealthy() - obstacle.getDamage());
            getPlayer().setHealthy(Math.max(getPlayer().getHealthy(), 0));
        }
    }
    public void getInventory(String name)
    {
        switch (name.toLowerCase()) {
            case "cave", "magara" -> getPlayer().getInventory().m_food = true;
            case "forest", "orman" -> getPlayer().getInventory().m_firewood = true;
            case "river", "nehir" -> getPlayer().getInventory().m_water = true;
            default -> System.out.println("Yanlıs Bölge ismi..!");
        }
    }

}
