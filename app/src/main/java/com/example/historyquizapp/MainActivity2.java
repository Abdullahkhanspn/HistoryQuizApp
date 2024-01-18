package com.example.historyquizapp;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {
    private final String [] questions ={"Columbus was the first European to sail to the Americas?","Gunpowder was invented in China?",
            "The Incan Empire lasted for over 2,000 years?","The saxophone was invented by Adolphe Sax?","Tomatoes originally came from the New World?"};
    private final boolean[] answers ={false,true,false,true,true};
    TextView question;
    private int index=0;
    private int score=0;
    Button yes;
    Button no;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        yes=findViewById(R.id.yes);
        no=findViewById(R.id.no);
        question=findViewById(R.id.question);
        question.setText(questions[index]);

        yes.setOnClickListener(v -> {
            //If array is not going out of bounds.
            if (index <= questions.length - 1) {
                //If you have given the correct answer,
                if (answers[index]) {
                    score++;
                }
                index++;
                if (index <= questions.length - 1) {
                    question.setText(questions[index]);
                } else {
                    Toast.makeText(MainActivity2.this, "Your Score is " + score, Toast.LENGTH_SHORT).show();
                }
            }
        });

        no.setOnClickListener(v -> {
            //If array is not going out of bounds.
            if (index <= questions.length - 1) {
                //If you have given the correct answer,
                if (!answers[index]) {
                    score++;
                }
                index++;
                if (index <= questions.length - 1) {
                    question.setText(questions[index]);
                } else {
                    Toast.makeText(MainActivity2.this, "Your Score is " + score, Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}