package com.example.portfolio3

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.view.view.*

class Adapter(var project: List<ProjectData>) : RecyclerView.Adapter<Adapter.myViewHolder>() {

    class myViewHolder(view: View): RecyclerView.ViewHolder(view) {
        var title= view.title
        var projectImg = view.project_img
        var techStack = view.tech_stack
        var typeIcon = view.type_icon
        var type = view.type
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): myViewHolder {
        var itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.view, parent, false)
        return myViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: myViewHolder, position: Int) {
        var dummyImage:Int?=null
        var dummyIconImage:Int?=null
        holder.itemView.setOnClickListener{
            val intent= Intent(holder.itemView.context,ProjectDetails::class.java)
            intent.putExtra("project",project[position])
            intent.putExtra("projectImage",dummyImage)
            intent.putExtra("iconImage",dummyIconImage)
            holder.itemView.context.startActivity(intent)
        }
        holder.title.text=project[position].title
        holder.techStack.text=project[position].techStack
        holder.type.text=project[position].type

        when(project[position].type!!.toLowerCase()){
            "individual"->{
                dummyIconImage=R.drawable.ic_person_svgrepo_com
            }
            "group"->{
                dummyIconImage=R.drawable.ic_people_svgrepo_com
            }
        }

        if(dummyIconImage!=null){
            holder.typeIcon.setImageResource(dummyIconImage)
        }

        when(project[position].title!!.toLowerCase()){
            "book my show clone"->{
                dummyImage=R.drawable.ic_react_svgrepo_com
            }
            "tasky"->{
                dummyImage=R.drawable.ic_js_svgrepo_com
            }
            "spirit pokemon"->{
                dummyImage=R.drawable.ic_java_svgrepo_com
            }
            "portfolio app"->{
                dummyImage=R.drawable.ic_kotlin_svgrepo_com
            }
            "twitter sentiment analysis"->{
                dummyImage=R.drawable.ic_python_5
            }
            "customer churn prediction"->{
                dummyImage=R.drawable.ic_python_5
            }
        }

        if(dummyImage!=null){
            holder.projectImg.setImageResource(dummyImage)
        }
    }

    override fun getItemCount(): Int {
        return project.size
    }
}
