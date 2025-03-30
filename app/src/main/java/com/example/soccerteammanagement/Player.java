package com.example.soccerteammanagement;

public class Player implements SoccerEntity {
    private String name;
    private int age;
    private String nationality;
    private String position;
    private String team;
    private int jerseyNumber;
//class with getters and setters
    public Player(String name, int age, String nationality, String position, String team, int jerseyNumber) {
        this.name = name;
        this.age = age;
        this.nationality = nationality;
        this.position = position;
        this.team = team;
        this.jerseyNumber = jerseyNumber;
    }

    @Override
    public String getId() {
        return name;
    }

    @Override
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getNationality() {
        return nationality;
    }

    public String getPosition() {
        return position;
    }

    public String getTeam() {
        return team;
    }

    public int getJerseyNumber() {
        return jerseyNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public void setJerseyNumber(int jerseyNumber) {
        this.jerseyNumber = jerseyNumber;
    }
} 