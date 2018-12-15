package com.example.khalidelgazzar.a2018courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int teamAScore;
    int teamBScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView teamAScoreTemp = (TextView)findViewById(R.id.team_a_score);
        teamAScore = Integer.parseInt(teamAScoreTemp.getText().toString());

        TextView teamBScoreTemp = (TextView)findViewById(R.id.team_b_score);
        teamBScore = Integer.parseInt(teamBScoreTemp.getText().toString());
    }


    //Functions to handle Team A

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void TeamAFreeThrow(android.view.View view) {
        teamAScore++;
        displayForTeamA(teamAScore);
    }
    public void TeamA2Points(android.view.View view) {
        teamAScore = teamAScore + 2;
        displayForTeamA(teamAScore);
    }

    public void TeamA3Points(android.view.View view)
    {
        teamAScore = teamAScore+3;
        displayForTeamA(teamAScore);
    }

    //Functions to handle Team B
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void TeamBFreeThrow(android.view.View view) {
        teamBScore++;
        displayForTeamB(teamBScore);
    }
    public void TeamB2Points(android.view.View view) {
        teamBScore = teamBScore + 2;
        displayForTeamB(teamBScore);
    }

    public void TeamB3Points(android.view.View view)
    {
        teamBScore = teamBScore+3;
        displayForTeamB(teamBScore);
    }

    public void Reset(android.view.View view)
    {
        teamAScore = 0;
        teamBScore = 0;
        displayForTeamA(teamAScore);
        displayForTeamB(teamBScore);
    }
}