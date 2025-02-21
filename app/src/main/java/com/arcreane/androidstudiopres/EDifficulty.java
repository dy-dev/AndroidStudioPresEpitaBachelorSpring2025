package com.arcreane.androidstudiopres;

public enum EDifficulty {
    EASY(10),
    MEDIUM(50),
    HARD(100);


    private final int m_iDifficulty;

    EDifficulty(int p_iDdifficulty) {
        m_iDifficulty = p_iDdifficulty;
    }
}
