package com.example.colorchanging;

import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    View view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Apply the background color to the root view of the activity
        view = findViewById(R.id.main); // Make sure R.id.main is the ID of the root view in activity_main.xml
        view.setBackgroundColor(ContextCompat.getColor(this, R.color.white));
    }

    public void  goRed(View v){
        view.setBackgroundColor(ContextCompat.getColor(this, R.color.red));

    }

    public void  goGreen(View v){
        view.setBackgroundColor(ContextCompat.getColor(this, R.color.green));

    }

    public void  goGray(View v){
        view.setBackgroundColor(ContextCompat.getColor(this, R.color.gray));

    }

    public void  goBlue(View v){
        view.setBackgroundColor(ContextCompat.getColor(this, R.color.blue));

    }



}
