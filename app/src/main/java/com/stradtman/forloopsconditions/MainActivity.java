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
    int colorCode, numberColors;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        colorCode = 0;
        buttonLayout = findViewById(R.id.button_layout);
        buttonLayout.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));
        buttonColor = findViewById(R.id.button_color);
        buttonColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                int targetColor;
//                if(((ColorDrawable)buttonLayout.getBackground()).getColor() == getResources().getColor(R.color.colorPrimaryDark)) {
//                    targetColor = R.color.colorAccent;
//                } else {
//                    targetColor = R.color.colorPrimary;
//                }
//                buttonLayout.setBackgroundColor(getResources().getColor(targetColor));
                int targetColor;
                switch(colorCode) {
                    case 0:
                        targetColor = android.R.color.holo_blue_dark;
                        break;
                    case 1:
                        targetColor = android.R.color.holo_orange_dark;
                        break;
                    case 2:
                        targetColor = android.R.color.holo_green_dark;
                        break;
                    case 3:
                        targetColor = android.R.color.holo_blue_light;
                        break;
                    case 4:
                        targetColor = android.R.color.holo_orange_light;
                        break;
                    case 5:
                        targetColor = android.R.color.holo_green_light;
                        break;
                    case 6:
                        targetColor = android.R.color.darker_gray;
                        break;
                    default:
                        targetColor = android.R.color.black;
                }
                buttonLayout.setBackgroundColor(getResources().getColor(targetColor));
                colorCode = ++colorCode % numberColors;
            }
        });
    }
}
