package com.example.animation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void animate(View view) {
        ImageView imageView = findViewById(R.id.boy);
       // imageView.animate().alpha(0).setDuration(500);
        //imageView.animate().translationXBy(650).setDuration(2000);
        //imageView.animate().translationYBy(-650) .setDuration(2000);
        //imageView.animate().rotation(-60).setDuration(2000);
        //imageView.animate().rotationXBy(360).alpha(0).setDuration(2000);
        imageView.animate().scaleX(0.7f).scaleY(0.2f).alpha(1).setDuration(2000);
    }
}