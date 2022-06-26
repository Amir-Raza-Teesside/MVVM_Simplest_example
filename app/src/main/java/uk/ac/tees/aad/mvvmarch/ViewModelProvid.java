package uk.ac.tees.aad.mvvmarch;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.ViewModel;

public class ViewModelProvid extends AndroidViewModel {

    Model model;

    public ViewModelProvid(@NonNull Application application) {
        super(application);

        model = new Model("Welcome From MVMM, :)");
    }

    public Model GetModel()
    {
        return  this.model;
    }
}
