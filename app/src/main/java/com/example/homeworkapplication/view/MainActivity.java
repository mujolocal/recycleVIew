package com.example.homeworkapplication.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;

import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.homeworkapplication.R;
import com.example.homeworkapplication.adapter.PersonAdapter;
import com.example.homeworkapplication.databinding.ActivityMainBinding;
import com.example.homeworkapplication.model.Person;
import com.example.homeworkapplication.viewmodel.MainViewModel;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    // TODO: 2/3/2021 Get data from viewmodel and load into recyclerview

    private ActivityMainBinding binding;
    private MainViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        binding.recycleview.setLayoutManager(linearLayoutManager);
        viewModel = new ViewModelProvider(this).get(MainViewModel.class);
        viewModel.loadPeopleList();
        initObservers();
    }

    private void initObservers(){

        viewModel.getPeople().observe(this, new Observer<List<Person>>() {
            @Override
            public void onChanged(List<Person> people) {
                PersonAdapter personAdapter = new PersonAdapter(people);
                binding.recycleview.setAdapter(personAdapter);
            }
        });
    }

}