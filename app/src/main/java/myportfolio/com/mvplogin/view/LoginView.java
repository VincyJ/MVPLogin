package myportfolio.com.mvplogin.view;

/**
 * Created by arputha_v on 2/21/2018.
 */

public interface LoginView {

    void showProgress();

    void hideProgress();

    void setUserNameError();

    void stPasswordError();

    void navigateToMainActivity();

    void showAlert();
}
