package com.example.soccerteammanagement;

import java.util.List;
import java.util.stream.Collectors;

public class TeamRepository extends Repository<Team> {
    
    public List<Team> filterByLeague(String league) {
        return filter(team -> team.getLeague().equals(league));
    }
} 