package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    TextView storyTextView;
    Button upButton;
    Button downButton;
    int mStoryIndex = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        storyTextView = findViewById(R.id.storyTextView);
        upButton = findViewById(R.id.buttonTop);
        downButton = findViewById(R.id.buttonBottom);

        updateView();
        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        upButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (mStoryIndex) {
                    case 1 :
                        mStoryIndex = 3;
                        break;
                    case 2:
                        mStoryIndex =3;
                        break;
                    case 3:
                        mStoryIndex =6;
                        break;
                }
                updateView();
            }
        });


        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        downButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (mStoryIndex) {
                    case 1:
                        mStoryIndex =2;
                        break;
                    case 2:
                        mStoryIndex =4;
                        break;
                    case 3:
                        mStoryIndex =5;
                        break;
                }
                updateView();
            }

        });

    }

    private void updateView() {
        switch (mStoryIndex) {
            case 1:
                storyTextView.setText(R.string.T1_Story);
                upButton.setText(R.string.T1_Ans1);
                downButton.setText(R.string.T1_Ans2);
                break;
            case 2:
                storyTextView.setText(R.string.T2_Story);
                upButton.setText(R.string.T2_Ans1);
                downButton.setText(R.string.T2_Ans2);
                break;
            case 3:
                storyTextView.setText(R.string.T3_Story);
                upButton.setText(R.string.T3_Ans1);
                downButton.setText(R.string.T3_Ans2);
                break;
            case 4:
                storyTextView.setText(R.string.T4_End);
                upButton.setVisibility(View.INVISIBLE);
                downButton.setVisibility(View.INVISIBLE);
                break;
            case 5:
                storyTextView.setText(R.string.T5_End);
                upButton.setVisibility(View.INVISIBLE);
                downButton.setVisibility(View.INVISIBLE);
                break;
            case 6:
                storyTextView.setText(R.string.T6_End);
                upButton.setVisibility(View.INVISIBLE);
                downButton.setVisibility(View.INVISIBLE);
                break;
        }
    }
}
