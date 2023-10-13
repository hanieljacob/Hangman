package com.example.hangman

data class Game(
    val word: String,
    val wrongGuesses: Integer,
    val newGame: Boolean,
    val guessedLetters: List<Character>
)