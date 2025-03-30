package com.example.soccerteammanagement;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

public class Teamviewholder extends RecyclerView.ViewHolder {
    private TextView teamName;
    private TextView league;
    private TextView country;
    private TextView stadium;
    private TextView foundingYear;
//class with getters for recyclerview
    public Teamviewholder(View itemView) {
        super(itemView);
        teamName = itemView.findViewById(R.id.team_name);
        league = itemView.findViewById(R.id.team_league);
        country = itemView.findViewById(R.id.team_country);
        stadium = itemView.findViewById(R.id.team_stadium);
        foundingYear = itemView.findViewById(R.id.team_founding_year);
    }

    public TextView getTeamName() {
        return teamName;
    }

    public TextView getLeague() {
        return league;
    }

    public TextView getCountry() {
        return country;
    }

    public TextView getStadium() {
        return stadium;
    }

    public TextView getFoundingYear() {
        return foundingYear;
    }
}