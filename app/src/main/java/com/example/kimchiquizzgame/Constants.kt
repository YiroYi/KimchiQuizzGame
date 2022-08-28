package com.example.kimchiquizzgame

object Constants {
  fun getQuestions() : ArrayList<Question> {
    val questionList = ArrayList<Question>()

    val que1 = Question(
      1,
      "What country does this flag belong to?",
      R.drawable.ic_flag_of_argentina,
      "Argentina",
      "Mexico",
      "U.S",
      "China",
      1
    )

    questionList.add(que1)

    val que2 = Question(
      2,
      "What country does this flag belong to?",
      R.drawable.ic_flag_of_australia,
      "Argentina",
      "Mexico",
      "U.S",
      "Australia",
      4
    )

    questionList.add(que2)

    val que3 = Question(
      3,
      "What country does this flag belong to?",
      R.drawable.ic_flag_of_belgium,
      "Argentina",
      "Belgium",
      "U.S",
      "China",
      2
    )

    questionList.add(que3)

    val que4 = Question(
      4,
      "What country does this flag belong to?",
      R.drawable.ic_flag_of_brazil,
      "Argentina",
      "Mexico",
      "U.S",
      "Brazil",
      4
    )

    questionList.add(que4)

    val que5 = Question(
      5,
      "What country does this flag belong to?",
      R.drawable.ic_flag_of_denmark,
      "Argentina",
      "Mexico",
      "Denmark",
      "China",
      3
    )

    questionList.add(que5)

    val que6 = Question(
      6,
      "What country does this flag belong to?",
      R.drawable.ic_flag_of_fiji,
      "Fiji",
      "Mexico",
      "U.S",
      "China",
      1
    )

    questionList.add(que6)

    val que7 = Question(
      7,
      "What country does this flag belong to?",
      R.drawable.ic_flag_of_germany,
      "Germany",
      "Mexico",
      "U.S",
      "China",
      1
    )

    questionList.add(que7)

    val que8 = Question(
      8,
      "What country does this flag belong to?",
      R.drawable.ic_flag_of_india,
      "Argentina",
      "India",
      "U.S",
      "China",
      2
    )

    questionList.add(que8)

    val que9 = Question(
      9,
      "What country does this flag belong to?",
      R.drawable.ic_flag_of_kuwait,
      "Argentina",
      "Mexico",
      "Kuwait",
      "China",
      3
    )

    questionList.add(que9)

    val que10 = Question(
      10,
      "What country does this flag belong to?",
      R.drawable.ic_flag_of_new_zealand,
      "Argentina",
      "Mexico",
      "U.S",
      "New Zealand",
      4
    )

    questionList.add(que10)
    return questionList
  }
}