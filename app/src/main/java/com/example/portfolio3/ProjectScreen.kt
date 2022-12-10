package com.example.portfolio3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_project_screen.*

class ProjectScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_project_screen)
        window.decorView.apply{systemUiVisibility= View.SYSTEM_UI_FLAG_HIDE_NAVIGATION or View.SYSTEM_UI_FLAG_FULLSCREEN}
        my_recycler.adapter=Adapter(setData.SetProjects())
//        my_recycler.adapter=Adapter2(setData.SetProjects())
        my_recycler.layoutManager= LinearLayoutManager(this)
    }
}