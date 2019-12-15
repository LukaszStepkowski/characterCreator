package character;

import enums.RaceTypes;
import inventory.Item;

import java.util.List;

public class Character {

    private String name;
    private RaceTypes race;
    private Proffesion proffesion;
    private List<Statistics> startingStatistics;
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
