package com.example.soccerteammanagement;

public class Team implements SoccerEntity {
    private String name;
    private String country;
    private String league;
    private String stadium;
    private int foundingYear;
//class with getters and setters
    public Team(String name, String country, String league, String stadium, int foundingYear) {
        this.name = name;
        this.country = country;
        this.league = league;
        this.stadium = stadium;
        this.foundingYear = foundingYear;
    }

    @Override
    public String getId() {
        return name;
    }

    @Override
    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public String getLeague() {
        return league;
    }

    public String getStadium() {
        return stadium;
    }

    public int getFoundingYear() {
        return foundingYear;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setLeague(String league) {
        this.league = league;
    }

    public void setStadium(String stadium) {
        this.stadium = stadium;
    }

    public void setFoundingYear(int foundingYear) {
        this.foundingYear = foundingYear;
    }
} 