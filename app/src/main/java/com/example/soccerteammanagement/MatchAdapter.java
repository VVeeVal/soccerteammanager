package com.example.soccerteammanagement;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class MatchAdapter extends RecyclerView.Adapter<Matchviewholder> {
    private List<Match> matches;
    private Context context;

    public MatchAdapter(List<Match> matches, Context context) {
        this.matches = matches;
        this.context = context;
    }

    @NonNull
    @Override
    public Matchviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.match_item, parent, false);
        return new Matchviewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Matchviewholder holder, int position) {
        Match match = matches.get(position);
        holder.getCompetition().setText(match.getCompetition());
        holder.getHomeTeam().setText(match.getHomeTeam());
        holder.getScore().setText(match.getScore());
        holder.getAwayTeam().setText(match.getAwayTeam());
        holder.getDate().setText(match.getDate());
        holder.getVenue().setText(match.getVenue());
    }

    @Override
    public int getItemCount() {
        return matches.size();
    }
} 