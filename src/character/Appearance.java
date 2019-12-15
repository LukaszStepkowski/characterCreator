package character;

import enums.Sexes;

public class Appearance {

    private int age;
    private int weight;
    private int height;
    private Sexes sex;
    private String eyeColor;
    private String hairColor;
    private String starSign;
    private int numberOfSiblings;
    private String specialMark;

    //probably going to have to change it to a builder design pattern

    public Appearance(int age, int weight, int height, Sexes sex, String eyeColor, String hairColor, String starSign, int numberOfSiblings, String specialMark) {
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.sex = sex;
        this.eyeColor = eyeColor;
        this.hairColor = hairColor;
        this.starSign = starSign;
        this.numberOfSiblings = numberOfSiblings;
        this.specialMark = specialMark;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

    public int getHeight() {
        return height;
    }

    public Sexes getSex() {
        return sex;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public String getHairColor() {
        return hairColor;
    }

    public String getStarSign() {
        return starSign;
    }

    public int getNumberOfSiblings() {
        return numberOfSiblings;
    }

    public String getSpecialMark() {
        return specialMark;
    }

    @Override
    public String toString() {
        return "Appearance{" +
                "age=" + age +
                ", weight=" + weight +
                ", height=" + height +
                ", sex=" + sex +
                ", eyeColor='" + eyeColor + '\'' +
                ", hairColor='" + hairColor + '\'' +
                ", starSign='" + starSign + '\'' +
                ", numberOfSiblings=" + numberOfSiblings +
                ", specialMark='" + specialMark + '\'' +
                '}';
    }
}
