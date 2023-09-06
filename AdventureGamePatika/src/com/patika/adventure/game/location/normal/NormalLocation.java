package com.patika.adventure.game.location.normal;

import com.patika.adventure.game.character.Player;
import com.patika.adventure.game.location.Location;

public abstract class NormalLocation extends Location {
    public NormalLocation(Player player, String name)
    {
        super(player, name);
    }
}
