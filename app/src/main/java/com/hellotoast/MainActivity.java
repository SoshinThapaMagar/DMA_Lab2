package com.hellotoast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int mCount = 0;
    private int remainder;
    private TextView mShowCount;
    private Button resetButton, countButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.show_count);
        resetButton = (Button) findViewById(R.id.button_Zero);
        countButton = (Button) findViewById(R.id.button_count);

    }

    public void showToast(View view) {
        Toast toast = Toast.makeText(this, R.string.toast_message,Toast.LENGTH_SHORT);
        toast.show();
    }

    public void countUp(View view) {
        resetButton.setBackgroundColor(ContextCompat.getColor(this,R.color.pink));
        mCount++;
        if (mShowCount != null) {
            mShowCount.setText(Integer.toString(mCount));
            if (mCount % 2 == 0) {
                view.setBackgroundColor(ContextCompat.getColor(this,R.color.blue));
            } else {
                view.setBackgroundColor(ContextCompat.getColor(this,R.color.lime));
            }
        }
    }

    public void zeroDown(View view) {
        view.setBackgroundColor(ContextCompat.getColor(this,R.color.gray));
        countButton.setBackgroundColor(ContextCompat.getColor(this,R.color.blue));
        mCount = 0;
        if (mShowCount != null) {
            mShowCount.setText(Integer.toString(mCount));
        }

    }
}