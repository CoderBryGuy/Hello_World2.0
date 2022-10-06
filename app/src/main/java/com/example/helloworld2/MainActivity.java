package com.example.helloworld2;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.lifecycle.ViewModelProvider;

public class MainActivity extends AppCompatActivity {
    MainActivityViewModel mMainActivityViewModel;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = findViewById(R.id.button);
        TextView textView = findViewById(R.id.textView);

        mMainActivityViewModel = new ViewModelProvider(this).get(MainActivityViewModel.class);

        //Getting the initial count
        textView.setText("You clicked me: " + mMainActivityViewModel.getInitialCount() + " times");

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //getting current count
                textView.setText("You clicked me: " + mMainActivityViewModel.getCounter() + " times.");
            }
        });


    }
}