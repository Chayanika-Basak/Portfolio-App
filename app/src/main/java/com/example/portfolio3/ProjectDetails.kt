package com.example.portfolio3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_project_details.*

class ProjectDetails : AppCompatActivity() {
    private lateinit var obj:ProjectData
    private var projectImg:Int?=null
    private var iconImg:Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_project_details)
        window.decorView.apply{systemUiVisibility= View.SYSTEM_UI_FLAG_HIDE_NAVIGATION or View.SYSTEM_UI_FLAG_FULLSCREEN}
        obj=intent.getParcelableExtra("project")!!
        projectImg=intent.getIntExtra("projectImage",-1)
        iconImg=intent.getIntExtra("iconImage",-1)
        setData(obj, projectImg!!)

        button_info.setOnClickListener{
            val intent= Intent(this, GithubActivity::class.java)
            startActivity(intent)
        }
    }
    private fun setData(obj:ProjectData,projectImg:Int){
        title_info.text=obj.title
        tech_stack_info.text=obj.techStack
        type_info.text=obj.type
        overview_info.text=obj.overview
        project_img_info.setImageResource(projectImg)
        type_icon_info.setImageResource(iconImg)
    }
}