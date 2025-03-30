package com.example.soccerteammanagement;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;
//stores the displayed teams, needed for the recyclerview
// https://www.geeksforgeeks.org/android-recyclerview/
public class TeamAdapter extends RecyclerView.Adapter<Teamviewholder> {
    private List<Team> teams;
    private Context context;
    private OnTeamClickListener onTeamClickListener;

    public interface OnTeamClickListener {
        void onTeamClick(Team team);
    }

    public TeamAdapter(List<Team> teams, Context context, OnTeamClickListener listener) {
        this.teams = teams;
        this.context = context;
        this.onTeamClickListener = listener;
    }

    @NonNull
    @Override
    public Teamviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.team_item, parent, false);
        return new Teamviewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Teamviewholder holder, int position) {
        Team team = teams.get(position);
        holder.getTeamName().setText(team.getName());
        holder.getLeague().setText(team.getLeague());
        holder.getCountry().setText(team.getCountry());
        holder.getStadium().setText(team.getStadium());
        holder.getFoundingYear().setText(String.valueOf(team.getFoundingYear()));

        // Set click listener for the entire item
        holder.itemView.setOnClickListener(v -> {
            if (onTeamClickListener != null) {
                onTeamClickListener.onTeamClick(team);
            }
        });
    }

    @Override
    public int getItemCount() {
        return teams.size();
    }
}