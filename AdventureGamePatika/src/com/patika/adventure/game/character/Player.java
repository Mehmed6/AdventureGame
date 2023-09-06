package com.patika.adventure.game.character;

import java.util.Scanner;

public class Player {
    private int m_damage, m_healthy, m_money, m_id;
    private String m_name;
    private Inventory m_inventory;
    private static final Scanner kb = new Scanner(System.in);
    public int getId()
    {
        return m_id;
    }
    public void setId(int id)
    {
        m_id = id;
    }
    public int getDamage()
    {
        return m_damage;
    }
    public void setDamage(int damage)
    {
        m_damage = damage;
    }
    public int getHealthy()
    {
        return m_healthy;
    }
    public void setHealthy(int healthy)
    {
        m_healthy = healthy;
    }
    public int getMoney()
    {
        return m_money;
    }
    public void setMoney(int money)
    {
        m_money = money;
    }
    public String getName()
    {
        return m_name;
    }
    public void setName(String name)
    {
        m_name = name;
    }
    public Inventory getInventory()
    {
        return m_inventory;
    }
    public void setInventory(Inventory inventory)
    {
        m_inventory = inventory;
    }

    public static Player selectCharacter()
    {
        System.out.println("Karakter | ID | Hasar | Sağlık | Para |");
        infoCharacter(new Samuray());
        infoCharacter(new Arrow());
        infoCharacter(new Paladin());

        System.out.print("Bir Karakter Seçin: ");
        String choice = kb.nextLine();

        switch (choice.toLowerCase()) {
            case "1", "samuray" -> {
                return new Samuray();
            }
            case "2", "okçu" -> {
                return new Arrow();
            }
            case "3", "şovalye" -> {
                return new Paladin();
            }
            default -> {
                System.out.println("Gecersiz Karakter Seçimi");
                return null;
            }
        }
    }
    public static void infoCharacter(Player player)
    {
        System.out.println("---------------------------------------");
        System.out.println(player.getName() + " | " + player.getId() + " | " + player.getDamage() + " | " +
                player.getHealthy() + " | " + player.getMoney() + " | ");
    }
}
