package com.example.portfolio3

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_github.view.*
import kotlinx.android.synthetic.main.view.view.*

class Adapter2(var project: List<ProjectData>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    class myViewHolder(view: View): RecyclerView.ViewHolder(view) {
        var title= view.title
        var projectImg = view.project_img
        var techStack = view.tech_stack
        var typeIcon = view.type_icon
        var type = view.type
    }

    class gitViewHolder(view: View): RecyclerView.ViewHolder(view) {
        var title= view.title_git
        var projectImg = view.image_git
        var link=view.gitLink
    }

    override fun getItemViewType(position: Int): Int {
        return position % 2 * 2
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        var itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.view, parent, false)

        if(viewType==2){
            return gitViewHolder(itemView)
        }

        return myViewHolder(itemView)
    }



    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        var dummyImage:Int?=null
        var dummyIconImage:Int?=null

        when(project[position].type!!.toLowerCase()){
            "individual"->{
                dummyIconImage=R.drawable.ic_person_svgrepo_com
            }
            "group"->{
                dummyIconImage=R.drawable.ic_people_svgrepo_com
            }
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

        when(holder.getItemViewType()){
            0->{
                val holder0: myViewHolder = holder as Adapter2.myViewHolder
                holder0.itemView.setOnClickListener{
                    val intent= Intent(holder0.itemView.context,ProjectDetails::class.java)
                    intent.putExtra("project",project[position])
                    intent.putExtra("projectImage",dummyImage)
                    intent.putExtra("iconImage",dummyIconImage)
                    holder0.itemView.context.startActivity(intent)
                }
                holder0.title.text=project[position].title
                holder0.techStack.text=project[position].techStack
                holder0.type.text=project[position].type
                if(dummyIconImage!=null){
                    holder0.typeIcon.setImageResource(dummyIconImage)
                }
                if(dummyImage!=null){
                    holder0.projectImg.setImageResource(dummyImage)
                }
            }

            2->{
                val holder2: gitViewHolder = holder as Adapter2.gitViewHolder
                holder2.itemView.setOnClickListener{
                    val intent= Intent(holder2.itemView.context,GithubActivity::class.java)
                    intent.putExtra("project",project[position])
                    intent.putExtra("projectImage",dummyImage)
                    holder2.itemView.context.startActivity(intent)
                }
                if(dummyImage!=null){
                    holder2.projectImg.setImageResource(dummyImage)
                }
            }
        }
    }

    override fun getItemCount(): Int {
        return project.size
    }
}
