package com.example.portfolio3

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_project_details.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        window.decorView.apply{systemUiVisibility=View.SYSTEM_UI_FLAG_HIDE_NAVIGATION or View.SYSTEM_UI_FLAG_FULLSCREEN}

        linkedin.setOnClickListener{
            val intent= Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com/in/chayanika-basak-183394239/"))
            startActivity(intent)
        }
    }
    fun switchActivity(view: View) {
        val intent= Intent(this@MainActivity, ProjectScreen::class.java )
        startActivity(intent)
    }
}