package com.company;
import java.io.BufferedReader;
public class Blowfish extends Fish implements AnimalName, AnimalBehavior, AnimalMove {
    private String TypeBancha56351;

    public Blowfish() {
        super();
        TypeBancha56351 = "Tetraodontidae ";
    }

    public Blowfish(String name, int age, int weight, String order, String Type) {
        super(name, age, weight, order);
        this.TypeBancha56351 = Type;
    }

    public Blowfish(int age, String order, String Type) {
        super(age, order);
        this.TypeBancha56351= Type;
    }

    public void travel() {
        System.out.println("I'm going  _");
    }

    @Override
    public void Search_For_Food() {
        System.out.println("The Blowfish is looking for something to eat ");
    }

    @Override
    public void getVoiceBancha56351() {
        System.out.println("Blu Blu BLu");
    }

    @Override
    public void eatBancha56351(String meal) {
        System.out.println("I am Eating " + meal);
    }

    public String getType() {
        return this.TypeBancha56351;
    }

    ;

    public void setType(String w) {
        this.TypeBancha56351 = w;
    }

    ;

    public String ToString() {
        return "BlowFish :\n " + "Type : " + TypeBancha56351;
    }

    @Override
    public void SleepBancha56351() {

    }

    @Override
    public void Sleep(String Sound) {
        Sound = "Zzzzzz";
        System.out.println(Sound);
    }

    @Override
    public void move() {
        System.out.println("Blowfish swim");
        ;
    }
}
