package uk.ac.tees.aad.mvvmarch;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import uk.ac.tees.aad.mvvmarch.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

     ActivityMainBinding activityMainBinding;
     ViewModelProvid viewModelProvid;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);

       viewModelProvid = ViewModelProviders.of(this).get(ViewModelProvid.class);
       activityMainBinding.setModel(viewModelProvid.GetModel());


    }
}