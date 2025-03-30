package com.example.soccerteammanagement;

import android.os.Bundle;
import android.util.Log;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class TeamPlayersActivity extends AppCompatActivity {
    private RecyclerView playersRecyclerView;
    private RecyclerView matchesRecyclerView;
    private PlayerAdapter playerAdapter;
    private MatchAdapter matchAdapter;
    private DataProvider dataProvider;
    private PlayerRepository playerRepository;
    private MatchRepository matchRepository;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_team_players);

        // Get the team name from intent
        String teamName = getIntent().getStringExtra("team_name");

        setTitle(teamName);

        dataProvider = new DataProvider();
        playerRepository = new PlayerRepository();
        matchRepository = new MatchRepository();

        List<Player> allPlayers = dataProvider.createSamplePlayers();
        List<Match> allMatches = dataProvider.createSampleMatches();
        
        for (Player player : allPlayers) {
            playerRepository.add(player);
        }
        for (Match match : allMatches) {
            matchRepository.add(match);
        }

        // flayers recyclerview
        playersRecyclerView = findViewById(R.id.players_recycler_view);
        playersRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        // filter players by team for the next view
        List<Player> teamPlayers = playerRepository.filterByTeam(teamName);
        playerAdapter = new PlayerAdapter(teamPlayers, this);
        playersRecyclerView.setAdapter(playerAdapter);

        // matches recyclerview
        matchesRecyclerView = findViewById(R.id.matches_recycler_view);
        matchesRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        // filter matches by team
        List<Match> teamMatches = matchRepository.filterByTeam(teamName);
        matchAdapter = new MatchAdapter(teamMatches, this);
        matchesRecyclerView.setAdapter(matchAdapter);
    }
} 