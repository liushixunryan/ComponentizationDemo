package cn.ryanliu.basic;

import android.app.Application;

import cn.ryanliu.arouter.ARouter;

public class BasicApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        ARouter.getInstance().init(this);

    }
}
