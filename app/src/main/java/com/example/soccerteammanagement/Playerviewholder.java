package com.example.soccerteammanagement;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

public class Playerviewholder extends RecyclerView.ViewHolder {
    private TextView playerName;
    private TextView age;
    private TextView nationality;
    private TextView position;
    private TextView team;
    private TextView jerseyNumber;

    public Playerviewholder(View itemView) {
        super(itemView);
        playerName = itemView.findViewById(R.id.player_name);
        age = itemView.findViewById(R.id.player_age);
        nationality = itemView.findViewById(R.id.player_nationality);
        position = itemView.findViewById(R.id.player_position);
        team = itemView.findViewById(R.id.player_team);
        jerseyNumber = itemView.findViewById(R.id.player_jersey_number);
    }

    public TextView getPlayerName() {
        return playerName;
    }

    public TextView getAge() {
        return age;
    }

    public TextView getNationality() {
        return nationality;
    }

    public TextView getTeam() {
        return team;
    }

    public TextView getJerseyNumber() {
        return jerseyNumber;
    }
}