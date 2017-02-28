package com.codeclan.example.stringsplit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
/**
 * Created by user on 27/02/2017.
 */

public class StringSplitterActivity extends AppCompatActivity {
    EditText questionEditText;
    Button countButton;
    TextView answerText;
    StringSplitter counter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stringsplitter1);


        questionEditText = (EditText) findViewById(R.id.question_edit);
        countButton = (Button) findViewById(R.id.Count_btn);
        answerText = (TextView) findViewById(R.id.answer_text);
        counter = new StringSplitter();
    }

    public void onCountButtonClicked(View view){
      String text = questionEditText.getText().toString();
       int count = counter.splitString(text);
        answerText.setText(Integer.toString(count) + "words entered!");

    }
}



