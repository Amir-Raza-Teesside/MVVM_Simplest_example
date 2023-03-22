package uk.ac.tees.aad.mvvmarch.Repo;

import uk.ac.tees.aad.mvvmarch.UserModel;

public class AppRepo {

    UserModel model;

    public AppRepo()
    {
        model = new UserModel("ass","passa");

    }

    public UserModel getModel() {
        return model;
    }
}
