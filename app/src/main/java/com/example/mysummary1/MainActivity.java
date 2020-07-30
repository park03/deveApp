package com.example.mysummary1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.textView);

        View view = findViewById(R.id.view);
        view.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v , MotionEvent event) {
                int action = event.getAction();

                if (action == MotionEvent.ACTION_DOWN) {

                } else if (action == MotionEvent.ACTION_MOVE) {

                } else if (action == MotionEvent.ACTION_UP) {

                } return true;

        ;
    }

    public void println(String data) {
        textView.append(data + "/n");
    }





}