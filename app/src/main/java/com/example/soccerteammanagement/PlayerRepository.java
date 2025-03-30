package com.example.soccerteammanagement;

import java.util.List;

public class PlayerRepository extends Repository<Player> {
    
    public List<Player> filterByTeam(String team) {
        return filter(player -> player.getTeam().equals(team));
    }
} 