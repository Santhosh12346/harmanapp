package com.example.harmanapp1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Employee an = new Employee("santhosh",12,true);
        an.setName("santhosh");
        Student Santhosh = new Student("an",123,true);
    }
    public void handleClick(View view){
        Toast.makeText(this, "Button Clicked", Toast.LENGTH_SHORT).show();

    }
}