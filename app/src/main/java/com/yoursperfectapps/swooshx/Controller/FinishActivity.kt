package com.yoursperfectapps.swooshx.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.yoursperfectapps.swooshx.Model.Player
import com.yoursperfectapps.swooshx.R
import com.yoursperfectapps.swooshx.Utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        val player = intent.getParcelableExtra<Player>(EXTRA_PLAYER)
        searchLeaguesText.text = "Looking for ${player.league} ${player.skill} league near you..."
    }
}
