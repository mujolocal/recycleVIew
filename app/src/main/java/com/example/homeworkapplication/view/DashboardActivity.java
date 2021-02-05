package com.example.homeworkapplication.view;

import android.content.Intent;
import android.os.Bundle;
import android.renderscript.ScriptGroup;
import android.util.Log;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.homeworkapplication.R;
import com.example.homeworkapplication.databinding.ActivityDashboardBinding;

public class DashboardActivity extends AppCompatActivity {

    private static final String TAG = "DashboardActivity";
    private ActivityDashboardBinding activityDashboardBinding;
    private String toResultsKey = "dashboardToResultsKey";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityDashboardBinding = ActivityDashboardBinding.inflate(getLayoutInflater());
        setContentView(activityDashboardBinding.getRoot());

        initButtons();
    }

    private void initButtons() {
        activityDashboardBinding.cat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //later: do cats
                Log.d(TAG, "onClick: cats");
            }
        });
        activityDashboardBinding.dog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ///do dogs later
                Log.d(TAG, "onClick: dogs");
            }
        });
        activityDashboardBinding.bird.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // do birds later
                Log.d(TAG, "onClick: birds");
            }
        });
        activityDashboardBinding.results.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onClick: resutlts");
                toAnimalResults();
            }
        });

    }

    private void toAnimalResults(String pack){
        Intent intent = new Intent(this, AnimalResultsActivity.class );
        intent.putExtra(toResultsKey, pack);
        startActivity(intent);
    }

}
