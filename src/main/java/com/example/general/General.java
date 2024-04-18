package com.example.general;

public class General {
    private int id;
    private String name;
    private String birthPlace;
    private int birthYear;
    private int age;

    public General(int id, String name, String birthPlace, int birthYear, int age) {
        this.id = id;
        this.name = name;
        this.birthPlace = birthPlace;
        this.birthYear = birthYear;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthplace() {
        return birthPlace;
    }

    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
