package com.example.portfolio3

object setData {
    fun SetProjects(): List<ProjectData>{
        var ProjectList = mutableListOf<ProjectData>()
        ProjectList.add(
            ProjectData(
                1,
                "Book My Show Clone",
                "MERN Stack",
                "Individual",
                "This was my first project where I tested my React and Javascript skills by cloning the Book My Show application.",
                "https://github.com/Chayanika-Basak/Book-My-Show"
            )
        )
        ProjectList.add(
            ProjectData(
                2,
                "Tasky",
                "HTML, CSS, Javascript",
                "Individual",
                "Here I learnt how to dynamically add cards using html in order to create a task management website.",
                "https://github.com/Chayanika-Basak/Tasky"
            )
        )
        ProjectList.add(
            ProjectData(
                3,
                "Spirit Pokemon",
                "HTML, CSS, Tailwind, Java",
                "Individual",
                "I tested out my backend skills using Java in this website where I also used MySQl for maintaining a database.",
                "https://github.com/Chayanika-Basak/Spirit-Pokemon"
            )
        )
        ProjectList.add(
            ProjectData(
                4,
                "Portfolio App",
                "Kotlin",
                "Individual",
                "Created a portfolio app to showcase my resume and projects using kotlin.",
                "https://github.com/Chayanika-Basak/Portfolio-App"
            )
        )
        ProjectList.add(
            ProjectData(
                5,
                "Twitter Sentiment Analysis",
                "Python",
                "Group",
                "In this project, we used a dataset containing 1.6 million tweets and classified them into tweets having negative or positive emotions.",
                "https://github.com/Chayanika-Basak/Twitter-Sentiment-Analysis"
            )
        )
        ProjectList.add(
            ProjectData(
                6,
                "Customer Churn Prediction",
                "Python",
                "Group",
                "In this project, we used a dataset from a telecom company containing services taken up by various users and predicted which users are most likely to leave the company.",
                "https://github.com/Chayanika-Basak/Customer-Churn-Prediction"
            )
        )
        return ProjectList
    }
}