package com.example.madt_lab_1;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private TextView TxtViewID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.TxtViewID = findViewById(R.id.TxtViewID);
    }
    public void DiffClk(View view){
        this.TxtViewID.setText("Text has been Changed");
    }

    public void ColorClk(View view) {
        this.TxtViewID.setTextColor(Color.CYAN);
    }

}