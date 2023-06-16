package xyz.sweet.mylib

fun welcome(vararg names: String): String {
    val s = if (names.size <= 1) "Salve, " else "Salvete, "
    return s + names.joinToString(separator = " & ")
}

fun question(): String = QuestionFactory.getQuestion()

fun goodbye(): String = "Vale!"
