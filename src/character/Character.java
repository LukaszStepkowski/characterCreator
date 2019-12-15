package character;

import enums.Races;
import inventory.Item;

import java.util.List;

public class Character {

    private String name;
    private Races race;
    private Profession profession;
    private Statistics startingStatistics;
    private Statistics currentStatistics;
    private List<Item> inventory;
    private Appearance appearance;
    private List<Item> weaponsOnHand;
    private List<Item> armourOnCharacter;
    private int currentExp;
    private int totalExp;
    private int money;
    private List<Skills> skills;
    private List<Traits> traits;

}
