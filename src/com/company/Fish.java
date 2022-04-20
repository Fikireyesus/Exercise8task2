package com.company;

class Fish extends Animal implements AnimalMove {
    private String GenBancha56351;



    public Fish(){
        super();
        GenBancha56351=" ";
    }
    public Fish(String name,int age , int weight , String General_type){
        super(name,age,weight);
        this.GenBancha56351=General_type;
    }
    public Fish(int age , String General_type){
        super(age);
        this.GenBancha56351=General_type;
    }

    public void Search_For_Food(){System.out.println("im looking for food ");}

    @Override
    public void getVoiceBancha56351() {
        System.out.println("Blu Blu BLu");
    }
    @Override
    public void eatBancha56351(String meal) {
        System.out.println("Fish is eating a "+ meal);
    }
    public String getGTypeBancha56351(){return this.GenBancha56351;};
    public void setTypeBancha56351(String w){this.GenBancha56351=w;};
    public String ToString(){
        return "Fish :\n "+"General Type of Fish : "+GenBancha56351;
    }

    @Override
    public void move() {
        System.out.println("Fish move");
    }
}
