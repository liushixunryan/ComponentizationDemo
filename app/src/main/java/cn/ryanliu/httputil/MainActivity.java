package cn.ryanliu.httputil;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import cn.ryanliu.annotation.BindPath;
import cn.ryanliu.arouter.ARouter;
import cn.ryanliu.common.LiveDataBus;

@BindPath(key = "main/main")
public class MainActivity extends AppCompatActivity {
    LiveDataBus.BusMutableLiveData<String> liveData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        liveData = LiveDataBus.getInstance().with("lisan",String.class);
        liveData.postValue("qqqqqqq");
    }

    public void ccccc(View view) {
        Bundle bundle = new Bundle();
        bundle.putString("ddd","ddd");
        ARouter.getInstance().jumpActivity("member/member",bundle);
    }
}