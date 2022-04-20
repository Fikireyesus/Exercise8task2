package com.company;

public abstract class Animal implements AnimalMove {
    String NameBancha56351;
    int ageBancha56351,weightBancha56351;

    public Animal(int age) {
        this.ageBancha56351=age;
    }

    public void eatBancha56351(String meal){};
    protected abstract void getVoiceBancha56351();
    public Animal(){
        ageBancha56351 = weightBancha56351=0;
       NameBancha56351="None";
    }
    public Animal(String name,int age , int weight){
        this.NameBancha56351=name;
        this.ageBancha56351=age;
        this.weightBancha56351=weight;
    }
    public String getNameBancha56351(){return NameBancha56351;};
    public void setNameBancha56351(String name){this.NameBancha56351=name;};
    public int getAgeBancha56351(){return this.ageBancha56351;};
    public void setAgeBancha56351(int w){this.ageBancha56351=w;};
    public int getWeightBancha56351(){return this.weightBancha56351;};
    public void setWeightBancha56351(int w){this.weightBancha56351=w;};


}