package com.patika.adventure.game.location.battle;

import com.patika.adventure.game.character.Player;
import com.patika.adventure.game.obstacle.Obstacle;
import com.patika.adventure.game.obstacle.ObstacleFactory;

public class Cave extends BattleLocation{
   // private final Obstacle[] m_obstacles;
    public Cave(Player player, String name)
    {
        super(player, name);
       // m_obstacles = ObstacleFactory.creatObstacle(getName());
    }

   /* public Obstacle[] getObstacle()
    {
        return m_obstacles;
    }

    */

    @Override
    public boolean onLocation()
    {
        return getPlayer() != null;
    }
}
