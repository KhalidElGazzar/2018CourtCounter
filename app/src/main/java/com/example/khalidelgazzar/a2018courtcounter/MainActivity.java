package com.example.khalidelgazzar.a2018courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int teamAScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // teamAScore = Integer.parseInt((findViewById(R.id.team_a_score).toString()));
    }

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
}
