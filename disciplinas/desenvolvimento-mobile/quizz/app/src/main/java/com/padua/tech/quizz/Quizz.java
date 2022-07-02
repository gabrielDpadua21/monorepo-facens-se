package com.padua.tech.quizz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.padua.tech.quizz.model.Question;

import java.util.ArrayList;
import java.util.List;

public class Quizz extends AppCompatActivity {

    TextView question;
    RadioButton option01, option02, option03, option04;
    int correct = R.id.rbOption01;
    int points = 0;
    List<Question> questions = new ArrayList<Question>() {
        {
            add(new Question("Java is?", R.id.rbOption03, "A software pattern", "A plataform", "A programming language", "A framework"));
            add(new Question("How this methods is no used in java?", R.id.rbOption02, "Overhide", "function", "Public", "Extends"));
            add(new Question("How this concepts is not OO", R.id.rbOption03, "Polimorfism", "heritage", "pure function", "private"));
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quizz);
        question = (TextView) findViewById(R.id.textViewQuestion);
        option01 = (RadioButton) findViewById(R.id.rbOption01);
        option02 = (RadioButton) findViewById(R.id.rbOption02);
        option03 = (RadioButton) findViewById(R.id.rbOption03);
        option04 = (RadioButton) findViewById(R.id.rbOption04);
        loadQuestions();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        loadQuestions();
    }

    public void btnSendOnClick(View view) {
        RadioGroup groupOptions = (RadioGroup) findViewById(R.id.rgOptions);
        RadioButton result = (RadioButton) findViewById(groupOptions.getCheckedRadioButtonId());
        Intent intent = new Intent(this, result.class);
        if(groupOptions.getCheckedRadioButtonId() == correct) {
            intent.putExtra("correct", true);
            points++;
        } else {
            intent.putExtra("correct", false);
        }
        intent.putExtra("points", points);
        startActivity(intent);
        result.setChecked(false);
    }

    private void loadQuestions() {
        Question questionLoad = questions.remove(0);
        question.setText(questionLoad.getText());
        List<String> options = questionLoad.getOptions();
        option01.setText(options.get(0));
        option02.setText(options.get(1));
        option03.setText(options.get(2));
        option04.setText(options.get(3));
        correct = questionLoad.getCorrect();
    }
}