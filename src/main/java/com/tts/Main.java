package com.tts;

import com.tts.petclass.Guitar;
import com.tts.petclass.Pet;

public class Main {
    public static final String PetName = "Shadow";

    public static final int PetAge = 91;
    public static final String PetLocation = "Hallway";
    public static final String PetType = "Dog";

    public static final String NewPetName = "Scruffles";
    public static final int NewPetAge = 1;
    public static final String NewPetLocation = "Kennel";
    public static final String NewPetType = "jack russell";

    private final static String GuitarElectric = "Fender Strat";
    private final static String GuitarColor = "Chocolate sunburst";
    private final static int GuitarYearMade = 1959;

    private final static String NewGuitarElectric = "Gibson SG";
    private final static String NewGuitarColor = "Heritage Cherry";
    private final static int NewGuitarYearMade = 2021;

    public static void main(String[] args) {


        System.out.println("Creating a new Pet!");
        Pet demoPet = new Pet(PetName, PetAge, PetLocation, PetType);
        testPetGetters(demoPet);
        testPetSetters(demoPet, NewPetName, NewPetAge, NewPetLocation, NewPetType);
        testPetGetters(demoPet);


        System.out.println("Creating a new Guitar!");
        Guitar demoGuitar = new Guitar(GuitarElectric, GuitarColor, GuitarYearMade);
        testGuitarGetters(demoGuitar);
        testGuitarSetters(demoGuitar, NewGuitarElectric, NewGuitarColor, NewGuitarYearMade);
        testGuitarGetters(demoGuitar);
    }

    private static void testPetGetters(Pet demoPet) {
        System.out.print("Getting pet name: ");
        System.out.println(demoPet.getName());

        System.out.print("Getting pet age: ");
        System.out.println(demoPet.getAge());

        System.out.print("Getting pet location: ");
        System.out.println(demoPet.getLocation());

        System.out.print("Getting pet type: ");
        System.out.println(demoPet.getType());
    }

    private static void testPetSetters(Pet demoPet, String newName, int newAge, String newLocation, String newType) {
        System.out.println("Setting pet name to: " + newName);
        demoPet.setName(newName);

        System.out.println("Setting pet age to: " + newAge);
        demoPet.setAge(newAge);

        System.out.println("Setting pet location to: " + newLocation);
        demoPet.setLocation(newLocation);

        System.out.println("Setting pet type to: " + newType);
        demoPet.setType(newType);
    }

    private static void testGuitarGetters(Guitar demoGuitar) {
        System.out.print("Trying to get name: ");
        System.out.println(demoGuitar.getName());

        System.out.print("Trying to get colors: ");
        System.out.println(demoGuitar.getColors());

        System.out.print("Trying to get date: ");
        System.out.println(demoGuitar.getDate());

        System.out.print("Trying to get legality: ");
        System.out.println(demoGuitar.getLegalSize());

        System.out.println("Trying to get full deck description:");
        System.out.println(demoGuitar.getFullDescription());
    }

    private static void testGuitarSetters(Guitar demoGuitar,String newName,String newColors, int newDate) {
        System.out.println("Setting guitar name to: " + newName);
        demoGuitar.setName(newName);

        System.out.println("Setting guitar colors to: " + newColors);
        demoGuitar.setColors(newColors);

        System.out.println("Setting guitar mfg date to: " + newDate);
        demoGuitar.setDate(newDate);
    }
}
