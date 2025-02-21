package com.arcreane.androidstudiopres;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class GuessANumber extends AppCompatActivity {
    Button m_DiffValidationButton;
    LinearLayout m_DiffLayout;
    LinearLayout m_GameLayout;

    EDifficulty m_eGameDifficulty;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guess_a_number);

        m_DiffValidationButton = findViewById(R.id.validationDifficultyButton);

       m_DiffLayout = findViewById(R.id.difficultyLayout);
       m_GameLayout = findViewById(R.id.gameLayout);

        m_DiffValidationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                m_DiffLayout.setVisibility(View.GONE);
                m_GameLayout.setVisibility(View.VISIBLE);
                Toast.makeText(GuessANumber.this,"Selected diff : " + m_eGameDifficulty.toString(),Toast.LENGTH_LONG).show();
            }
        });
    }

    public void selectDiff(View view) {
        m_DiffValidationButton.setEnabled(true);
        String tag = view.getTag().toString();
        m_eGameDifficulty = EDifficulty.valueOf(tag);
    }
}