package com.quizapp

import com.quizapp.R
import com.quizapp.Question

object Constants {

    // TODO (STEP 1: Create a constant variables which we required in the result screen.)
    // START
    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"
    // END
    
    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        // 1
        val que1 = Question(
            1, "Pilihlah Jawaban Dengan Tepat!",
            R.drawable.ishihara00,
            "12", "72",
            "17", "22", 1
        )

        questionsList.add(que1)

        // 2
        val que2 = Question(
            2, "Pilihlah Jawaban Dengan Tepat!",
            R.drawable.ishihara01,
            "71", "14",
            "74", "77", 3
        )

        questionsList.add(que2)

        // 3
        val que3 = Question(
            3, "Pilihlah Jawaban Dengan Tepat!",
            R.drawable.ishihara02,
            "0", "8",
            "5", "6", 4
        )

        questionsList.add(que3)

        // 4
        val que4 = Question(
            4, "Pilihlah Jawaban Dengan Tepat!",
            R.drawable.ishihara03,
            "76", "16",
            "18", "78", 2
        )

        questionsList.add(que4)

        // 5
        val que5 = Question(
            5, "Pilihlah Jawaban Dengan Tepat!",
            R.drawable.ishihara04,
            "3", "7",
            "2", "5", 3
        )

        questionsList.add(que5)

        // 6
        val que6 = Question(
            6, "Pilihlah Jawaban Dengan Tepat!",
            R.drawable.ishihara05,
            "29", "28",
            "79", "Semua Jawaban Salah", 1
        )

        questionsList.add(que6)

        // 7
        val que7 = Question(
            7, "Pilihlah Jawaban Dengan Tepat!",
            R.drawable.ishihara06,
            "1", "4",
            "7", "2", 3
        )

        questionsList.add(que7)

        // 8
        val que8 = Question(
            8, "Pilihlah Jawaban Dengan Tepat!",
            R.drawable.ishihara07,
            "75", "15",
            "Semua Jawaban Salah", "45", 4
        )

        questionsList.add(que8)

        // 9
        val que9 = Question(
            9, "Pilihlah Jawaban Dengan Tepat!",
            R.drawable.ishihara08,
            "6", "5",
            "8", "2", 2
        )

        questionsList.add(que9)

        // 10
        val que10 = Question(
            10, "Pilihlah Jawaban Dengan Tepat!",
            R.drawable.ishihara09,
            "97", "81",
            "87", "91", 1
        )

        questionsList.add(que10)

        // 11
        val que11 = Question(
            11, "Pilihlah Jawaban Dengan Tepat!",
            R.drawable.ishihara10,
            "6", "3",
            "9", "8", 4
        )

        questionsList.add(que11)

        // 12
        val que12 = Question(
            12, "Pilihlah Jawaban Dengan Tepat!",
            R.drawable.ishihara11,
            "43", "42",
            "12", "72", 2
        )

        questionsList.add(que12)

        // 13
        val que13 = Question(
            13, "Pilihlah Jawaban Dengan Tepat!",
            R.drawable.ishihara12,
            "3", "8",
            "6", "9", 1
        )

        questionsList.add(que13)


        // 14
        val que14 = Question(
                14, "Pilihlah Jawaban Dengan Tepat!",
                R.drawable.ishihara13,
                "12", "17",
                "15", "13", 3
        )

        questionsList.add(que14)

        // 15
        val que15 = Question(
                15, "Pilihlah Jawaban Dengan Tepat!",
                R.drawable.ishihara14,
                "2", "5",
                "3", "7", 1
        )

        questionsList.add(que15)

        // 16
        val que16 = Question(
                16, "Pilihlah Jawaban Dengan Tepat!",
                R.drawable.ishihara15,
                "52", "57",
                "32", "22", 2
        )

        questionsList.add(que16)

        // 17
        val que17 = Question(
                17, "Pilihlah Jawaban Dengan Tepat!",
                R.drawable.ishihara16,
                "23", "77",
                "22", "73", 4
        )

        questionsList.add(que17)

        // 18
        val que18 = Question(
                18, "Pilihlah Jawaban Dengan Tepat!",
                R.drawable.ishihara17,
                "26", "66",
                "36", "76", 1
        )

        questionsList.add(que18)

        // 19
        val que19 = Question(
                19, "Pilihlah Jawaban Dengan Tepat!",
                R.drawable.ishihara18,
                "53", "33",
                "55", "35", 4
        )

        questionsList.add(que19)

        // 20
        val que20 = Question(
                20, "Pilihlah Jawaban Dengan Tepat!",
                R.drawable.ishihara19,
                "96", "90",
                "66", "69", 1
        )

        questionsList.add(que20)

        // 21
        val que21 = Question(
                21, "Gambar binatang apakah ini?",
                R.drawable.ishihara20,
                "Sapi", "Monyet",
                "Burung", "Kucing", 2
        )

        questionsList.add(que21)

        // 22
        val que22 = Question(
                22, "Gambar binatang apakah ini?",
                R.drawable.ishihara21,
                "Sapi", "Monyet",
                "Burung", "Kucing", 4
        )

        questionsList.add(que22)

        // 23
        val que23 = Question(
                23, "Gambar binatang apakah ini?",
                R.drawable.ishihara22,
                "Capung", "Belalang",
                "Burung", "Singa", 1
        )

        questionsList.add(que23)

        // 24
        val que24 = Question(
                24, "Gambar binatang apakah ini?",
                R.drawable.ishihara23,
                "Sapi", "Monyet",
                "Nyamuk", "Kucing", 3
        )

        questionsList.add(que24)

        return questionsList
    }
}