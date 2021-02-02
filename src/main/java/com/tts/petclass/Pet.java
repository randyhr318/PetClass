package com.tts.petclass;

public class Pet {

    private String name;
    private int age;
    private String location;
    private String type;

    private static final String DEFAULT_NAME = "No name specified";
    private static final int DEFAULT_AGE = 0;
    private static final String DEFAULT_LOCATION = "No location specified";
    private static final String DEFAULT_TYPE = "No type specified";


    public Pet(){
        this(DEFAULT_NAME, DEFAULT_AGE, DEFAULT_LOCATION, DEFAULT_TYPE);
    }

    public Pet(String name, int age, String location, String type){
        this.name = name;
        this.age = age;
        this.location=location;
        this.type = type;
    }


    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public String getLocation(){
        return this.location;
    }
    public String getType(){
        return this.type;
    }

    public void setName(String newName){
        this.name = newName;
    }
    public void setAge(int newAge){
        this.age=newAge;
    }
    public void setLocation(String newLocation){
        this.location = newLocation;
    }
    public void setType(String newType){
        this.type = newType;
    }


}
