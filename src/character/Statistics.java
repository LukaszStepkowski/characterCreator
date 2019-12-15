package character;

public class Statistics {

    private int melee;
    private int ranged;
    private int vim;
    private int resistance;
    private int agility;
    private int intelligence;
    private int willPower;
    private int charisma;
    private int numberOfAttacks;
    private int hitPoints;
    private int strength;
    private int vitality;
    private int speed;
    private int magic;
    private int madnessPoints;
    private int destinyPoints;

    //probably going to have to change it to a builder design pattern

    public Statistics(int melee, int ranged, int vim, int resistance, int agility, int intelligence, int willPower,
                      int charisma, int numberOfAttacks, int hitPoints, int strength, int vitality, int speed,
                      int magic, int madnessPoints, int destinyPoints) {
        this.melee = melee;
        this.ranged = ranged;
        this.vim = vim;
        this.resistance = resistance;
        this.agility = agility;
        this.intelligence = intelligence;
        this.willPower = willPower;
        this.charisma = charisma;
        this.numberOfAttacks = numberOfAttacks;
        this.hitPoints = hitPoints;
        this.strength = strength;
        this.vitality = vitality;
        this.speed = speed;
        this.magic = magic;
        this.madnessPoints = madnessPoints;
        this.destinyPoints = destinyPoints;
    }

    public int getMelee() {
        return melee;
    }

    public void setMelee(int melee) {
        this.melee = melee;
    }

    public int getRanged() {
        return ranged;
    }

    public void setRanged(int ranged) {
        this.ranged = ranged;
    }

    public int getVim() {
        return vim;
    }

    public void setVim(int vim) {
        this.vim = vim;
    }

    public int getResistance() {
        return resistance;
    }

    public void setResistance(int resistance) {
        this.resistance = resistance;
    }

    public int getAgility() {
        return agility;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getWillPower() {
        return willPower;
    }

    public void setWillPower(int willPower) {
        this.willPower = willPower;
    }

    public int getCharisma() {
        return charisma;
    }

    public void setCharisma(int charisma) {
        this.charisma = charisma;
    }

    public int getNumberOfAttacks() {
        return numberOfAttacks;
    }

    public void setNumberOfAttacks(int numberOfAttacks) {
        this.numberOfAttacks = numberOfAttacks;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getVitality() {
        return vitality;
    }

    public void setVitality(int vitality) {
        this.vitality = vitality;
    }

    public int getSpeed() {
        return speed;
    }

    public int getMagic() {
        return magic;
    }

    public void setMagic(int magic) {
        this.magic = magic;
    }

    public int getMadnessPoints() {
        return madnessPoints;
    }

    public void setMadnessPoints(int madnessPoints) {
        this.madnessPoints = madnessPoints;
    }

    public int getDestinyPoints() {
        return destinyPoints;
    }

    public void setDestinyPoints(int destinyPoints) {
        this.destinyPoints = destinyPoints;
    }

    @Override
    public String toString() {
        return "Statistics{" +
                "melee=" + melee +
                ", ranged=" + ranged +
                ", vim=" + vim +
                ", resistance=" + resistance +
                ", agility=" + agility +
                ", intelligence=" + intelligence +
                ", willPower=" + willPower +
                ", charisma=" + charisma +
                ", numberOfAttacks=" + numberOfAttacks +
                ", hitPoints=" + hitPoints +
                ", strength=" + strength +
                ", vitality=" + vitality +
                ", speed=" + speed +
                ", magic=" + magic +
                ", madnessPoints=" + madnessPoints +
                ", destinyPoints=" + destinyPoints +
                '}';
    }
}
