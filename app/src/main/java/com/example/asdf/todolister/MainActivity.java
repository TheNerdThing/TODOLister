package com.example.asdf.todolister;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private final String TAG = "TODO Lister App";
    private ArrayList<TaskList> taskLists;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStop() {
        super.onStop();
        // write any list that the user has.
        saveList();
    }

    private void saveList(){
        Log.d(TAG, "Feature not yet implemented");
    }

}
