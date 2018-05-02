package myportfolio.com.mvplogin.interacter;

/**
 * Created by arputha_v on 2/21/2018.
 */

public interface LoginInteracter {

    interface onLoginFinishedListener {

        void onUsernameError();

        void onPasswordError();

        void onSuccess();

        void onFailure(String message);
    }

    void login(String username, String password, onLoginFinishedListener listener);
}
