package com.example.homeworkapplication.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.homeworkapplication.R;
import com.example.homeworkapplication.databinding.PersonItemBinding;
import com.example.homeworkapplication.model.Person;

import java.util.List;

// TODO: 2/3/2021 Create adapter to take a List<Person>
public class PersonAdapter  extends RecyclerView.Adapter<PersonAdapter.PersonViewHolder> {
    private final List<Person> persons;
    public PersonAdapter(List<Person> persons){
        this.persons = persons;
    }

    @NonNull
    @Override
    public PersonViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.person_item
//                ,parent
//                ,false);
        PersonItemBinding binding = PersonItemBinding.inflate(LayoutInflater.from(parent.getContext()),
                parent,
                false);
        return new PersonViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull PersonViewHolder holder, int position) {
        Person person = persons.get(position);
        holder.loadperson(person);
    }

    @Override
    public int getItemCount() {
        return persons.size();
    }

    static class PersonViewHolder extends RecyclerView.ViewHolder{
        private final PersonItemBinding binding;
        public PersonViewHolder(@NonNull PersonItemBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
        public void loadperson(Person person){

            binding.age.setText(String.valueOf(person.getAge()));
            binding.firstName.setText(person.getFirstName());
            binding.lastName.setText(person.getLastName());
            binding.personEmail.setText(person.getEmail());
        }
    }
}
