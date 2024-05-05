package com.example.rpm_practice2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class NewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);

        TextView messageText =  new TextView(this);
        messageText.setTextSize(26);
        messageText.setPadding(16, 16, 16, 16);

        Bundle arguments = getIntent().getExtras();
        if (arguments!=null) {
            String name = arguments.getString("name");
            String group = arguments.getString("group");
            int age = arguments.getInt("age");
            int grade = arguments.getInt("grade");
            messageText.setText("Имя: " + name + "\nГруппа: " + group + "\nВозраст: " + age + "\nОценка: " + grade);
        }
        setContentView(messageText);
    }
}