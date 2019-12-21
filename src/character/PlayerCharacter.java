package character;

import enums.Races;
import inventory.Item;

import java.util.List;

public class PlayerCharacter {

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

    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                ", race=" + race +
                ", profession=" + profession +
                ", startingStatistics=" + startingStatistics +
                ", currentStatistics=" + currentStatistics +
                ", inventory=" + inventory +
                ", appearance=" + appearance +
                ", weaponsOnHand=" + weaponsOnHand +
                ", armourOnCharacter=" + armourOnCharacter +
                ", currentExp=" + currentExp +
                ", totalExp=" + totalExp +
                ", money=" + money +
                ", skills=" + skills +
                ", traits=" + traits +
                '}';
    }

    public static CharacterBuilder builder() {
        return new CharacterBuilder();
    }

    public static class CharacterBuilder {

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

        public CharacterBuilder characterName(String name) {
            this.name = name;
            return this;
        }

        public CharacterBuilder characterRace(Races race) {
            this.race = race;
            return this;
        }

//        public Builder characterProfession (Profession profession) {
//            this.profession = profession;
//            return this;
//        }

        public PlayerCharacter build() {
            PlayerCharacter character = new PlayerCharacter();

            character.name = this.name;
            character.race = this.race;

            return character;
        }

    }
}
