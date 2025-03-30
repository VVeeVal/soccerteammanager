package com.example.soccerteammanagement;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

//stores the displayed movies, needed for the recyclerview
// https://www.geeksforgeeks.org/android-recyclerview/
public class PlayerAdapter extends RecyclerView.Adapter<Playerviewholder> {
    private List<Player> players;
    private Context context;

    public PlayerAdapter(List<Player> players, Context context) {
        this.players = players;
        this.context = context;
    }

    @NonNull
    @Override
    public Playerviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.player_item, parent, false);
        return new Playerviewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Playerviewholder holder, int position) {
        Player player = players.get(position);
        holder.getPlayerName().setText(player.getName());
        holder.getAge().setText(String.valueOf(player.getAge()));
        holder.getNationality().setText(player.getNationality());
        holder.getTeam().setText(player.getTeam());
        holder.getJerseyNumber().setText(String.valueOf(player.getJerseyNumber()));
    }


    @Override
    public int getItemCount() {
        return players.size();
    }
}