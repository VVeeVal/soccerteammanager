package com.example.soccerteammanagement;

import java.util.List;

public class MatchRepository extends Repository<Match> {
    
    public List<Match> filterByTeam(String team) {
        return filter(match -> 
            match.getHomeTeam().equals(team) || 
            match.getAwayTeam().equals(team)
        );
    }
} 