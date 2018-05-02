package myportfolio.com.mvplogin.presenter;

/**
 * Created by arputha_v on 2/21/2018.
 */

public interface LoginPresenter {

    void validateCredentials(String userName, String password);

    void onDestroy();
}
