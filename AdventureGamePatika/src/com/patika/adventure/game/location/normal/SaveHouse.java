package com.patika.adventure.game.location.normal;

import com.patika.adventure.game.character.Player;

public class SaveHouse extends NormalLocation{
    public SaveHouse(Player player, String name)
    {
        super(player, name);

    }

    @Override
    public boolean onLocation()
    {
        return this.getPlayer() != null;
    }
}
