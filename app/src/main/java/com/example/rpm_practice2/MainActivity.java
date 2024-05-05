package com.example.rpm_practice2;

import static androidx.constraintlayout.helper.widget.MotionEffect.TAG;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart: ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume: ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause: ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop: ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy: ");
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: ");

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        EditText nameText = findViewById(R.id.editTextText1);
//        EditText groupText = findViewById(R.id.editTextText2);
//        EditText ageText = findViewById(R.id.editTextText3);
//        EditText gradeText = findViewById(R.id.editTextText4);
//
//        String name = nameText.getText().toString();
//        String group = groupText.getText().toString();
//        int age = Integer.parseInt(ageText.getText().toString());
//        int grade = Integer.parseInt(gradeText.getText().toString());
//
//        Button button = findViewById(R.id.button);
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(MainActivity.this, NewActivity.class);
//                intent.putExtra("name", name);
//                intent.putExtra("group", group);
//                intent.putExtra("age", age);
//                intent.putExtra("grade", grade);
//                startActivity(intent);
//            }
//        });

    }

    public void onNextActivity(View view) {

        EditText nameText = findViewById(R.id.editTextText1);
        EditText groupText = findViewById(R.id.editTextText2);
        EditText ageText = findViewById(R.id.editTextText3);
        EditText gradeText = findViewById(R.id.editTextText4);

        String name = nameText.getText().toString();
        String group = groupText.getText().toString();
        int age = Integer.parseInt(ageText.getText().toString());
        int grade = Integer.parseInt(gradeText.getText().toString());

        Intent intent = new Intent(this, NewActivity.class);
        intent.putExtra("name", name);
        intent.putExtra("group", group);
        intent.putExtra("age", age);
        intent.putExtra("grade", grade);

        startActivity(intent);
    }

}