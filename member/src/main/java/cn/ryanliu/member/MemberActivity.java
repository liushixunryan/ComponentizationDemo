package cn.ryanliu.member;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import cn.ryanliu.annotation.BindPath;
import cn.ryanliu.common.LiveDataBus;

@BindPath(key = "member/member")
public class MemberActivity extends AppCompatActivity {
    LiveDataBus.BusMutableLiveData<String> liveData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_member);

        liveData  = LiveDataBus.getInstance().with("lisan", String.class);

        liveData.observe(MemberActivity.this,false, new Observer<String>() {
            @Override
            public void onChanged(String s) {
                Log.e("ryanoiu",s );
            }
        });

        Bundle bundle = this.getIntent().getExtras();
        TextView ddd = findViewById(R.id.ddd);
        ddd.setText(bundle.getString("ddd"));

//        getLifecycle().addObserver(new MyLifecycleObserve());
    }


//    //感知生命周期
//    class MyLifecycleObserve implements LifecycleEventObserver{
//        @Override
//        public void onStateChanged(@NonNull LifecycleOwner source, @NonNull Lifecycle.Event event) {
//            Log.e("ryanliu", event.name());
//        }
//    }
}