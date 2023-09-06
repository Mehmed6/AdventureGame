package com.patika.adventure.game.location;

import com.patika.adventure.game.character.Player;

public abstract class Location {
    private final Player m_player;
    private final String m_name;

    public Location(Player player, String name)
    {
        m_player = player;
        m_name = name;
    }

    public Player getPlayer() {
        return m_player;
    }

    public String getName() {
        return m_name;
    }

    public abstract boolean onLocation();

}
