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
        // load task list
        this.loadList();
    }


    @Override
    protected void onStop() {
        super.onStop();
        // write any list that the user has.
        this.saveList();
    }
    private void loadList(){
        Log.d(TAG, "loadList: Feature not yet implemented");
    }
    private void saveList(){
        Log.d(TAG, "saveList: Feature not yet implemented");
    }

    /**
     * shows all task list on the GUI
     */
    private void displayAlltaskList(){
        Log.d(TAG, "loadTasklistIntoGUI: Feature not yet implemented");
    }

    /**
     * displays a single task list on the GUI
     */
    private void displaySingleTaskList(TaskList list){
        Log.d(TAG, "displayTaskList: Feature not yet implemented");
    }

}
