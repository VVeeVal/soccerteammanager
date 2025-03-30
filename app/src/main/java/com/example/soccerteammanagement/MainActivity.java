package com.example.soccerteammanagement;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class MainActivity extends AppCompatActivity implements TeamAdapter.OnTeamClickListener {
    private RecyclerView teamsRecyclerView;
    private TeamAdapter teamAdapter;
    private DataProvider dataProvider;
    private TeamRepository teamRepository;
    private List<Team> allTeams;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//initialize the data
        dataProvider = new DataProvider();
        teamRepository = new TeamRepository();

//create the teams and add them to the teamRepository
        allTeams = dataProvider.createSampleTeams();
        for (Team team : allTeams) {
            teamRepository.add(team);
        }

//Recyclerview
        teamsRecyclerView = findViewById(R.id.teams_recycler_view);
        teamsRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        teamAdapter = new TeamAdapter(allTeams, this, this);
        teamsRecyclerView.setAdapter(teamAdapter);

    //filter for the teams
        EditText leagueFilter = findViewById(R.id.league_filter);
        leagueFilter.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                filterTeams(s.toString());
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

    }

    private void filterTeams(String league) {
        if (league.isEmpty()) {
            teamAdapter = new TeamAdapter(allTeams, this, this);
        } else {
            List<Team> filteredTeams = teamRepository.filterByLeague(league);
            teamAdapter = new TeamAdapter(filteredTeams, this, this);
        }
        teamsRecyclerView.setAdapter(teamAdapter);
    }
//moving to the next activity
    @Override
    public void onTeamClick(Team team) {

        Intent intent = new Intent(this, TeamPlayersActivity.class);
        intent.putExtra("team_name", team.getName());
        startActivity(intent);
    }
}