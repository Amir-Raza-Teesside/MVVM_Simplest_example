package uk.ac.tees.aad.mvvmarch.ViewModel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

import uk.ac.tees.aad.mvvmarch.UserModel;

public class UserViewModel extends AndroidViewModel {

    UserModel userModel;

    public UserViewModel(@NonNull Application application) {


        super(application);
        userModel = new UserModel("Aamr","amirraza2501@gmail.com");
        userModel = new UserModel("Aamr2","amirraza2501@gmail.com2");
    }

    public UserModel getUserModel()
    {
        if(userModel  !=null)
        {
            return  userModel;
        }
        return null;
    }
}
