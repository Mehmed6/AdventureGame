package com.patika.adventure.game.obstacle;

import java.util.Random;

public class ObstacleFactory {
    private static final Random m_random = new Random();
    public static Obstacle[] creatObstacle(String name)
    {
        var obstacle = m_random.nextInt(1,4);
        var result = new Obstacle[obstacle];

        switch (name) {
            case "Cave", "Magara" -> {
                for (var i = 0; i < obstacle; ++i) {
                    result[i] = new Zombie();
                }
                return result;
            }

            case "Forest", "Orman" -> {
                for (var i = 0; i < obstacle; ++i) {
                    result[i] = new Vampire();
                }
                return result;
            }

            case "River", "Nehir" -> {
                for (var i = 0; i < obstacle; ++i) {
                    result[i] = new Bear();
                }
                return result;
            }
        }
        System.out.println("Gecersiz Yaratık İsmi..!");
        return null;
    }
}
