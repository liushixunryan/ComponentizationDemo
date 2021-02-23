package cn.ryanliu.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import cn.ryanliu.annotation.BindPath;
import cn.ryanliu.arouter.ARouter;

@BindPath(key = "login/login")
public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

//        startActivity(new Intent(LoginActivity.this, ARouter.getInstance().getActivity("member/member")));
    }
}