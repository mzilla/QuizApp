package com.example.quizapp

object Constants{
    const val USER_NAME: String = "user_name"

    fun getQuestions(): ArrayList<Question>{
        val questionsList = ArrayList<Question>()
        val que1 = Question(1, "What song does this cover belong to?",
        R.drawable.ic_onemanarmy,
            "One Man Army",
            "Gemlife",
            "The Color Purple",
            "100 Doors",
            1

            )
        questionsList.add(que1)
        val que2 = Question(2, "What song does this cover belong to?",
            R.drawable.ic_rebellion,
            "GO",
            "Rebellion",
            "Birds",
            "Boom",
            2
        )
        questionsList.add(que2)
        return questionsList
    }
}