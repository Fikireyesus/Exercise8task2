package com.company;

class Mammal extends Animal implements AnimalMove, AnimalBehavior, AnimalName {
    private String orderBancha56351;



    public Mammal() {
        super();
        orderBancha56351 = " ";
    }

    public Mammal(String name, int age, int weight, String order) {
        super(name, age, weight);
        this.orderBancha56351 = order;
    }

    public Mammal(int age, String order) {
        super(age);
        this.orderBancha56351 = order;
    }

    public void SleepBancha56351() {
        System.out.println("zzz");
    }

    @Override
    public void getVoiceBancha56351() {
        System.out.println("I am Making Sound !@#%$$#@#");
    }

    @Override
    public void eatBancha56351(String meal) {
        System.out.println("Mamal is eating a " + meal);
    }

    public String getOrderBancha56351() {
        return this.orderBancha56351;
    }

    ;

    public void setOrderBancha56351(String w) {
        this.orderBancha56351 = w;
    }

    ;

    public String ToStringBancha56351() {
        return "Mammal :\n " + "Order : " + orderBancha56351;
    }




    @Override
    public void Sleep(String Sound) {
        Sound = "Zzzzz";
    }

}
