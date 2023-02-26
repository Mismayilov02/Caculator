package com.imcalculator.calcualtor;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.imcalculator.calcualtor.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    String number = "" , firstnmber="" ;
    boolean first = true , firstEquals = true , abc = true;

    private MainViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        viewModel = new ViewModelProvider(this).get(MainViewModel.class);


        viewModel.getDataText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(String s) {
                binding.dataText.setText(s) ;
            }
        });

        viewModel.getNumber().observe(this, new Observer<String>() {
            @Override
            public void onChanged(String s) {
                number = s;
            }
        });
        viewModel.getFirstNumber().observe(this, new Observer<String>() {
            @Override
            public void onChanged(String s) {
                firstnmber  = s;
            }
        });

        viewModel.getAnsverText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(String s) {
                binding.equalsText.setText(s);
            }
        });

        viewModel.getFirstEquals().observe(this, new Observer<Boolean>() {
                    @Override
                    public void onChanged(Boolean aBoolean) {
                        firstEquals = aBoolean;
                    }
        });

        viewModel.getFirst().observe(this, new Observer<Boolean>() {
            @Override
            public void onChanged(Boolean aBoolean) {
                first = aBoolean;
            }
        });

    binding.bottomNavi.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()){
                    case R.id.sun_menu:
                     getDelegate().setLocalNightMode(AppCompatDelegate.MODE_NIGHT_NO);
                        return true;
                    case R.id.moon_menu:
                        getDelegate().setLocalNightMode(AppCompatDelegate.MODE_NIGHT_YES);
                            return true;

                    default: return  false;
                }


            }
        });
        
        
    }


    public  void btnset(View vview){
      viewModel.btnClick(vview);
    }

    public  void operator(View view){
      viewModel.operator(view);
    }

    public  void equaals(String choose){
          viewModel.eguals(choose);
    }


}