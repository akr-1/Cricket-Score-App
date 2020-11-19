package com.example.cricketscore;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    int scoreA=0;
    int scoreB=0;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //code for team A begins
    public void displayforteamA(int score)
    {
        TextView scoreview = (TextView) findViewById(R.id.team_a_score);
        scoreview.setText(String.valueOf(score));
    }
    public void four(View view)
    {
         scoreA=scoreA+4;
         displayforteamA(scoreA);
    }
    public void six(View view)
    {
        scoreA=scoreA+6;
        displayforteamA(scoreA);
    }
    public void run(View view)
    {
        scoreA=scoreA+1;
        displayforteamA(scoreA);
    }
    public void extras(View view)
    {
        scoreA=scoreA+1;
        displayforteamA(scoreA);
    }
    //code for team A ends.

    //code for team B begins.
    public void displayforteamB(int score)
    {
        TextView scoreview = (TextView) findViewById(R.id.team_b_score);
        scoreview.setText(String.valueOf(score));
    }
    public void four1(View view)
    {
        scoreB=scoreB+4;
        displayforteamB(scoreB);
    }
    public void six1(View view)
    {
        scoreB=scoreB+6;
        displayforteamB(scoreB);
    }
    public void run1(View view)
    {
        scoreB=scoreB+1;
        displayforteamB(scoreB);
    }
    public void extras1(View view)
    {
        scoreB=scoreB+1;
        displayforteamB(scoreB);
    }
    //code for team B ends.

    //code for reset button.
    public void reset(View view)
    {
        scoreA=0;
        scoreB=0;
        displayforteamA(0);
        displayforteamB(0);
    }
}