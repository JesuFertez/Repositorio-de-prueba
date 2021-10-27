package com.example.usodefragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.usodefragments.databinding.FragmentWelcomBinding;


public class WelcomFragment extends Fragment {

    private FragmentWelcomBinding binding;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        initBinding(inflater,container);
        setupOnClicklistener();
        return binding.getRoot();

    }

    private void initBinding(LayoutInflater inflater, ViewGroup container) {
        binding = FragmentWelcomBinding.inflate(inflater,container,false);
    }

    private void setupOnClicklistener() {
        binding.btnStart.setOnClickListener(view ->{
            goToTriviaFragment();
        });
    }

    private void goToTriviaFragment() {
            Navigation.findNavController(binding.getRoot()).navigate(R.id.action_welcomFragment_to_triviaFragment, getNameForTriviaParam());
    }

    private Bundle getNameForTriviaParam() {
        Bundle bundle = new Bundle ();
        String name = binding.etName.getText().toString();
        bundle.putString(TriviaFragment.NAME_PARAM,name);
        return bundle;

    }

}