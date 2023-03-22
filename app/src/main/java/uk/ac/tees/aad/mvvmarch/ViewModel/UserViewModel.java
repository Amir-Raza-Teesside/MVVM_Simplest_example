package uk.ac.tees.aad.mvvmarch.ViewModel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

import uk.ac.tees.aad.mvvmarch.Repo.AppRepo;
import uk.ac.tees.aad.mvvmarch.UserModel;

public class UserViewModel extends AndroidViewModel {

    AppRepo appRepo;

    public UserViewModel(@NonNull Application application) {


        super(application);

        appRepo = new AppRepo();

    }

    public UserModel getAppRepo() {
        return appRepo.getModel();
    }
}
