package com.company;

public class Dog extends Mammal implements AnimalBehavior,AnimalMove {
    private String FavColorBancha56351;

    Dog() {
        super();
        FavColorBancha56351 = "Black";
    }

    public Dog(String name, int age, int weight, String order, String favColor) {
        super(name, age, weight, order);
        this.FavColorBancha56351 = favColor;
    }

    public Dog(int age, String order, String favColor) {
        super(age, order);
        this.FavColorBancha56351 = favColor;
    }

    public void WakeUp() {
        System.out.println("I Just Woke Up _");
    }

    @Override
   public void SleepBancha56351() {
        System.out.println("The Dog Is Slepping");
    }

    @Override
   public void getVoiceBancha56351() {
        System.out.println("Haw Haw");
    }

    @Override
    public void eatBancha56351(String meal) {
        System.out.println("I am Eating my Crochets");
    }

    public String getFavColorBancha56351() {
        return this.FavColorBancha56351;
    }

    ;

    public void setFavColorBancha56351(String w) {
        this.FavColorBancha56351 = w;
    }

    ;

    public String ToString() {
        return "Dog :\n " + "Favorite Color : " + FavColorBancha56351;
    }


    @Override
    public void Sleep(String Sound) {
        Sound = "Zzzzz";
        System.out.println(Sound);
    }

    @Override
    public void move() {
        System.out.println("Dog runs");
    }
}
