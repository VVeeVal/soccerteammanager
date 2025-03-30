package com.example.soccerteammanagement;

import java.util.List;

public class TeamIterator implements CustomIterator<Team> {
    private List<Team> teams;
    private int currentIndex;

    public TeamIterator(List<Team> teams) {
        this.teams = teams;
        this.currentIndex = 0;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < teams.size();
    }

    @Override
    public Team next() {
        if (hasNext()) {
            return teams.get(currentIndex++);
        }
        return null;
    }
} 