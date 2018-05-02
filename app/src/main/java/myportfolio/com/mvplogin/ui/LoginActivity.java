package myportfolio.com.mvplogin.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import myportfolio.com.mvplogin.view.LoginView;
import myportfolio.com.mvplogin.R;
import myportfolio.com.mvplogin.presenter.LoginPresenter;
import myportfolio.com.mvplogin.presenter.LoginPresenterImplementation;

public class LoginActivity extends AppCompatActivity implements LoginView {

    private EditText etUserName;
    private EditText etPassword;
    private Button btLogin;

    private LoginPresenter loginPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        loginPresenter = new LoginPresenterImplementation(this);

        etUserName = findViewById(R.id.et_username);
        etPassword = findViewById(R.id.et_password);
        btLogin = findViewById(R.id.btn_login);

        btLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                loginPresenter.validateCredentials(etUserName.getText().toString().trim(), etPassword.getText().toString().trim());
            }
        });
    }

    @Override
    public void showProgress() {

    }

    @Override
    public void hideProgress() {

    }

    @Override
    public void setUserNameError() {

    }

    @Override
    public void stPasswordError() {

    }

    @Override
    public void navigateToMainActivity() {

    }

    @Override
    public void showAlert() {

    }
}
