package com.example.homeworkapplication.view;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.homeworkapplication.databinding.ActiviyAnimalsResultsBinding;

public class AnimalResultsActivity extends AppCompatActivity {
    private ActiviyAnimalsResultsBinding activiyAnimalsResultsBinding;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activiyAnimalsResultsBinding = ActiviyAnimalsResultsBinding.inflate(getLayoutInflater());
        setContentView(activiyAnimalsResultsBinding.getRoot());


    }
}
