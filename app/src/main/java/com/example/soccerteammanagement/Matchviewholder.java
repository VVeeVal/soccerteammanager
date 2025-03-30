package com.example.soccerteammanagement;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

public class Matchviewholder extends RecyclerView.ViewHolder {
    private TextView competition;
    private TextView homeTeam;
    private TextView score;
    private TextView awayTeam;
    private TextView date;
    private TextView venue;

    public Matchviewholder(View itemView) {
        super(itemView);
        competition = itemView.findViewById(R.id.match_competition);
        homeTeam = itemView.findViewById(R.id.match_home_team);
        score = itemView.findViewById(R.id.match_score);
        awayTeam = itemView.findViewById(R.id.match_away_team);
        date = itemView.findViewById(R.id.match_date);
        venue = itemView.findViewById(R.id.match_venue);
    }

    public TextView getCompetition() {
        return competition;
    }

    public TextView getHomeTeam() {
        return homeTeam;
    }

    public TextView getScore() {
        return score;
    }

    public TextView getAwayTeam() {
        return awayTeam;
    }

    public TextView getDate() {
        return date;
    }

    public TextView getVenue() {
        return venue;
    }
} 