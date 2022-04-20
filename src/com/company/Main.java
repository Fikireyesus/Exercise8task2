package com.company;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException
    {
        Animal animal[]= new Animal[6];
        animal[0]= new Mammal("James",7,15,"Security");
        animal[1]= new Dog("Bob",12,10,"Germany","Black");
        animal[2]= new Bird("chris",6,3,"Parrots");
        animal[3]= new Fish("Tod",3,2,"Jawless");
        animal[4]= new Blowfish("Dusan",7,11,"France","Blow");
        animal[5]= new Pigeon("Jadon",60,30,"Atlantic",351);

        AnimalBehavior animalBehavior[]= new AnimalBehavior[3];
        animalBehavior[0]= new Dog("Son",3,10,"Moz","Yellow");
        animalBehavior[1]= (AnimalBehavior) new Pigeon("Willy",2,4,"Brazil",351);
        animalBehavior[2]= new Blowfish("Ben",1,2,"England","Yellow");


        for(Animal a:animal){
            a.move();
        }

        for (Animal a: animal){
            AnimalName.name(a.getNameBancha56351());

        }



    }
}