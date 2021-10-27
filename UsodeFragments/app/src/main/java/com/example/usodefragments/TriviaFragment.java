package com.example.usodefragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import com.example.usodefragments.databinding.FragmentTriviaBinding;
import com.squareup.picasso.Picasso;


public class TriviaFragment extends Fragment {

    public static final String NAME_PARAM = "name";
    private FragmentTriviaBinding binding;

    public TriviaFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        initBinding(inflater, container);
        obtainNameParam();
        cargarImagenWhatsapp();
        loadFragmentAnswer();

        return binding.getRoot();
    }


    private void initBinding(LayoutInflater inflater, ViewGroup container) {
        binding = FragmentTriviaBinding.inflate(inflater, container, false);
    }

    private void obtainNameParam() {
         String name = getArguments().getString(NAME_PARAM);
        binding.tvSaludoUser.setText("Hola, " + name + "!");
    }

    private void cargarImagenWhatsapp() {

        Picasso.get().load("https://1000marcas.net/wp-content/uploads/2019/11/WhatsApp-logo.png").into(binding.ivImagenWhatsapp);
    }

    private void loadFragmentAnswer() {

        binding.btnSend.setOnClickListener(View ->
        {
            if (binding.rdBWhatsapp.isChecked()) {
                goToWinnerFragment();
            } else {
                goToLoserFragment();
            }

        });
    }

    private void goToWinnerFragment() {
        Navigation.findNavController(binding.getRoot()).navigate(R.id.action_triviaFragment_to_winnerFragment,getArgs());
    }

    private void goToLoserFragment() {
        Navigation.findNavController(binding.getRoot()).navigate(R.id.action_triviaFragment_to_loserFragment, getArgs());

    }

    private Bundle getArgs(){
        Bundle bundle = new Bundle ();
        bundle.putString(NAME_PARAM,getArguments().getString(NAME_PARAM));
        return bundle;
    }


}
