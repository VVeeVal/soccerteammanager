package com.example.soccerteammanagement;

public class Match {
    private String homeTeam;
    private String awayTeam;
    private String score;
    private String competition;
    private String date;
    private String venue;
//class with getters and setters
    public Match(String homeTeam, String awayTeam, String score, String competition, String date, String venue) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.score = score;
        this.competition = competition;
        this.date = date;
        this.venue = venue;
    }

    public String getId() {
        return homeTeam + "_vs_" + awayTeam + "_" + date;
    }

    public String getHomeTeam() {
        return homeTeam;
    }

    public String getAwayTeam() {
        return awayTeam;
    }

    public String getScore() {
        return score;
    }

    public String getCompetition() {
        return competition;
    }

    public String getDate() {
        return date;
    }

    public String getVenue() {
        return venue;
    }

    public void setHomeTeam(String homeTeam) {
        this.homeTeam = homeTeam;
    }

    public void setAwayTeam(String awayTeam) {
        this.awayTeam = awayTeam;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public void setCompetition(String competition) {
        this.competition = competition;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }
} 