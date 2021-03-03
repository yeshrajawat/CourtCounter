package com.codingblocks.courtcounter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var teamAscore:Int = 0
    var teamBscore:Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    //This function will display score of Team A
    fun displayForTeamA(score:Int)
    {
     val team_a = findViewById<TextView>(R.id.team_a_score)
     team_a.text = "$score"
    }
    // This function will display score of Team B

    fun displayForTeamB(score:Int)
    {
        val team_b = findViewById<TextView>(R.id.team_b_score)
        team_b.text = "$score"
    }

    fun addA3(view: View) {
         teamAscore+= 3

        displayForTeamA(teamAscore)
    }
    fun addA2(view: View) {
        teamAscore += 2
        displayForTeamA(teamAscore)
    }
    fun freepointA(view: View) {
        teamAscore += 1
        displayForTeamA(teamAscore)
    }

    fun addB3(view: View) {
        teamBscore+= 3

        displayForTeamB(teamBscore)
    }
    fun addB2(view: View) {
        teamBscore += 2
        displayForTeamB(teamBscore)
    }
    fun freepointB(view: View) {
        teamBscore += 1
        displayForTeamB(teamBscore)
    }

    fun reset(view: View) {
        teamAscore = 0
        teamBscore = 0
        displayForTeamA(teamAscore)
        displayForTeamB(teamBscore)
    }
}