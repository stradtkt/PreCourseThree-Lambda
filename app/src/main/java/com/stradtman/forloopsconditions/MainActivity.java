package com.stradtman.forloopsconditions;

import android.graphics.drawable.ColorDrawable;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button buttonColor;
    ConstraintLayout buttonLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonLayout = findViewById(R.id.button_layout);
        buttonLayout.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));
        buttonColor = findViewById(R.id.button_color);
        buttonColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int targetColor;
                if(((ColorDrawable)buttonLayout.getBackground()).getColor() == getResources().getColor(R.color.colorPrimaryDark)) {
                    targetColor = R.color.colorAccent;
                } else {
                    targetColor = R.color.colorPrimary;
                }
                buttonLayout.setBackgroundColor(getResources().getColor(targetColor));
            }
        });
    }
}
