package uk.ac.tees.aad.mvvmarch;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import uk.ac.tees.aad.mvvmarch.ViewModel.UserViewModel;
import uk.ac.tees.aad.mvvmarch.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

     ActivityMainBinding activityMainBinding;
     UserViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);


        viewModel = ViewModelProviders.of(MainActivity.this).get(UserViewModel.class);

        activityMainBinding.setUserModel(viewModel.getUserModel());




    }
}