package com.example.helloworld2;

import androidx.lifecycle.ViewModel;

public class MainActivityViewModel extends ViewModel {
    private int counter = 0;

    //When the app first launched
    public int getInitialCount(){
        return counter;
    }

    //When user clicks the button
    public int getCounter(){
        counter++;
        return counter;
    }


}
