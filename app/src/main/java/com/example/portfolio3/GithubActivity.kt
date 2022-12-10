package com.example.portfolio3

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_github.*
import kotlinx.android.synthetic.main.activity_project_details.*

class GithubActivity : AppCompatActivity() {
    private lateinit var obj:ProjectData
    private var projectImg:Int?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_github)
        window.decorView.apply{systemUiVisibility= View.SYSTEM_UI_FLAG_HIDE_NAVIGATION or View.SYSTEM_UI_FLAG_FULLSCREEN}
        obj=intent.getParcelableExtra("project")!!
        projectImg=intent.getIntExtra("projectImage",-1)
        setData(obj, projectImg!!)

        gitLink.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(obj.link))
            startActivity(intent)
        }

    }

    private fun setData(obj:ProjectData,projectImg:Int){
        title_git.text=obj.title
        gitLink.text=obj.link
        image_git.setImageResource(projectImg)
    }
}