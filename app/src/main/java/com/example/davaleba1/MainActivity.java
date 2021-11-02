package com.example.davaleba1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    EditText inputWordEditText;
    TextView showWordTextView;
    Button buttonChangeWord;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputWordEditText = findViewById(R.id.editTextInputWord);
        showWordTextView = findViewById(R.id.resultTextTextView);
        buttonChangeWord = findViewById(R.id.changeTextViewTextButton);

        buttonChangeWord.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String word = inputWordEditText.getText().toString();
                showWordTextView.setText(word);
                inputWordEditText.setText("");
            }
        });
    }
}
