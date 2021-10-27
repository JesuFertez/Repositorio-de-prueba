package com.example.usodefragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.usodefragments.databinding.FragmentLoserBinding;


public class LoserFragment extends Fragment {

    private FragmentLoserBinding binding;

    public LoserFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        initBinding(inflater,container);
        setOnClickListener();
        showMessageUsuer();
        return binding.getRoot();
    }

    private void initBinding(LayoutInflater inflater,ViewGroup container) {
        binding = FragmentLoserBinding.inflate(inflater, container,false);
    }

    private void showMessageUsuer() {
        binding.tvYouLoseMessage.setText("Perdiste "+ getArguments().get(TriviaFragment.NAME_PARAM)+ " !");

    }

    private void setOnClickListener() {
        binding.btnGameAgainLoser.setOnClickListener(View -> {
            Navigation.findNavController(binding.getRoot()).navigate(R.id.action_loserFragment_to_welcomFragment,null);
        });
    }
}