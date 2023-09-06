package com.patika.adventure.game.location.normal;

import com.patika.adventure.game.character.Player;
import com.patika.adventure.game.store.Iventory;
import com.patika.adventure.game.store.armors.Armors;
import com.patika.adventure.game.store.weapons.Weapons;

import java.util.Scanner;

public class ToolStore extends NormalLocation{
    public static final Scanner kb = new Scanner(System.in);

    public ToolStore(Player player, String name)
    {
        super(player, name);
    }

    @Override
    public boolean onLocation()
    {
        return this.getPlayer() != null;
    }

    public void menu()
    {
       // System.out.println("----------------------------------------");
        System.out.println("--------- MAĞAZAYA HOŞGELDİNİZ ---------");
        System.out.println("Suanki Mevcut Paranız : " + getPlayer().getMoney());
        System.out.println("Silah Satın Almak için (1) - Kalkan Satın ALmak İçin (2) Giriniz: ");
        System.out.println("----------------------------------------");

        var choice = Integer.parseInt(kb.nextLine());
        
        Iventory iven = switch (choice) {
            case 1 -> Weapons.selectWeapons();
            case 2 -> Armors.selectArmors();
            default -> throw new IllegalStateException("Unexpected value: " + choice);
        };

        if (iven != null && iven.getPrice() <= getPlayer().getMoney()) {
            buy(iven);
            System.out.println("Tebrikler artık " + iven.getName() + " Envanterine sahipsin..!");
        }
        else
            System.out.println("Bu Envanteri satın almak için yeterli paranız yok..!");
    }

    public void buy(Iventory iven)
    {
        if (iven instanceof Weapons) {
            getPlayer().getInventory().m_weaponName = iven.getName();
            getPlayer().getInventory().m_weaponDamage = iven.getDamage();
            getPlayer().setDamage(getPlayer().getDamage() + iven.getDamage());
            getPlayer().setMoney(getPlayer().getMoney() - iven.getPrice());
        } else if (iven instanceof Armors) {
            getPlayer().getInventory().m_armorName = iven.getName();
            getPlayer().getInventory().m_armorDefence = iven.getDefence();
            getPlayer().setHealthy(getPlayer().getHealthy() + iven.getDefence());
            getPlayer().setMoney(getPlayer().getMoney() - iven.getPrice());
        }

    }
}
