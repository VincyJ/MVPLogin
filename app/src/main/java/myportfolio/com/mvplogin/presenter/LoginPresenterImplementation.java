package myportfolio.com.mvplogin.presenter;

import myportfolio.com.mvplogin.view.LoginView;
import myportfolio.com.mvplogin.interacter.LoginInteracter;
import myportfolio.com.mvplogin.interacter.LoginInteracterImplementation;

/**
 * Created by arputha_v on 2/21/2018.
 */

public class LoginPresenterImplementation implements LoginPresenter, LoginInteracter.onLoginFinishedListener {

    LoginView mLoginView;
    LoginInteracter mLoginInteracter;

    public LoginPresenterImplementation(LoginView mView) {
        this.mLoginView = mView;
        this.mLoginInteracter = new LoginInteracterImplementation();
    }


    @Override
    public void validateCredentials(String userName, String password) {
        if (mLoginView != null) {
            mLoginView.showProgress();
        }
        mLoginInteracter.login(userName, password, this);
    }

    @Override
    public void onDestroy() {
        if (mLoginView != null) mLoginView = null;

    }

    @Override
    public void onUsernameError() {

    }

    @Override
    public void onPasswordError() {

    }

    @Override
    public void onSuccess() {

    }

    @Override
    public void onFailure(String message) {

    }
}
