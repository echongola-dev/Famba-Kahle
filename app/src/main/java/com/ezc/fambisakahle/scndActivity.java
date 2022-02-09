package com.ezc.fambisakahle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class scndActivity extends AppCompatActivity {

    private String selectedTopicName = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scnd);

        final LinearLayout could = findViewById(R.id.couldLayout);
        final LinearLayout bad = findViewById(R.id.badLayout);
        final LinearLayout shopping = findViewById(R.id.shoppingLayout);
        final LinearLayout call = findViewById(R.id.callLayout);

        final Button button = findViewById(R.id.button);

        could.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                selectedTopicName = "could";

                could.setBackgroundResource(R.drawable.round_back_white_stoke);

                bad.setBackgroundResource(R.drawable.round_back_white_10);
                shopping.setBackgroundResource(R.drawable.round_back_white_10);
                call.setBackgroundResource(R.drawable.round_back_white_10);

            }
        });

        bad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                selectedTopicName = "bad";

                bad.setBackgroundResource(R.drawable.round_back_white_stoke);

                could.setBackgroundResource(R.drawable.round_back_white_10);
                shopping.setBackgroundResource(R.drawable.round_back_white_10);
                call.setBackgroundResource(R.drawable.round_back_white_10);
            }
        });

        shopping.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                selectedTopicName = "shopping";

                shopping.setBackgroundResource(R.drawable.round_back_white_stoke);

                could.setBackgroundResource(R.drawable.round_back_white_10);
                bad.setBackgroundResource(R.drawable.round_back_white_10);
                call.setBackgroundResource(R.drawable.round_back_white_10);

            }
        });

        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                selectedTopicName = "call";

                call.setBackgroundResource(R.drawable.round_back_white_stoke);

                could.setBackgroundResource(R.drawable.round_back_white_10);
                shopping.setBackgroundResource(R.drawable.round_back_white_10);
                bad.setBackgroundResource(R.drawable.round_back_white_10);
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(selectedTopicName.isEmpty()){
                    Toast.makeText(scndActivity.this, "por favor selecione o topico", Toast.LENGTH_SHORT).show();
                }
                else{
                    Intent intent = new Intent(scndActivity.this, QuizActivity.class);
                    intent.putExtra("selectedTopic", selectedTopicName);
                    startActivity(intent);
                }
            }
        });

    }
}