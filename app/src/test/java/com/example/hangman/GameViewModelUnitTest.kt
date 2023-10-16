package com.example.hangman

import androidx.lifecycle.SavedStateHandle
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test

class GameViewModelUnitTest {

    private lateinit var gameViewModel: GameViewModel
    private val mockSavedStateHandle = SavedStateHandle()

    @Before
    fun setup() {
        gameViewModel = GameViewModel(mockSavedStateHandle)
    }

    @Test
    fun getNewGameWordTest(){
        val testWords = listOf("TEST_WORD_1", "TEST_WORD_2", "TEST_WORD_3")
        gameViewModel.words = testWords
        val result = gameViewModel.getNewGameWord()
        assertEquals(result in testWords, true)
    }
}