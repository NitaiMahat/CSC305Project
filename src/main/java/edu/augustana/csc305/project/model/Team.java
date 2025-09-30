package edu.augustana.csc305.project.model;

import java.util.ArrayList;
import java.util.List;

public class Team {

    private String teamName;
    private List<String> players;

    public Team(String teamName){
        this.teamName = teamName;
        this.players = new ArrayList<>();
    }

    public Team(String teamName, List<String> players){
        this(teamName);
        if (players != null){
            this.players.addAll(players);
        }
    }

    public void addPlayer(String playerName){
        if (playerName != null && !playerName.trim().isEmpty()){
            players.add(playerName);
        }
    }
}
