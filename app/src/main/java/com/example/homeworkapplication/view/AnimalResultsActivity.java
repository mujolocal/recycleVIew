package com.example.homeworkapplication.view;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.homeworkapplication.R;
import com.example.homeworkapplication.databinding.ActiviyAnimalsResultsBinding;

public class AnimalResultsActivity extends AppCompatActivity {
    private ActiviyAnimalsResultsBinding activiyAnimalsResultsBinding;
    private static final String TAG = "AnimalResultsActivity";
    private String toResultsKey = "dashboardToResultsKey";


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activiyAnimalsResultsBinding = ActiviyAnimalsResultsBinding.inflate(getLayoutInflater());
        setContentView(activiyAnimalsResultsBinding.getRoot());
        Log.d(TAG, "onCreate:here ");
        Intent intent = getIntent();
        Log.d(TAG, "onCreate: "+intent.getStringExtra(toResultsKey));


    }
}
