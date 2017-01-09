package code.template.com.Activity;

import android.os.Bundle;
import android.widget.Toast;

import com.crashlytics.android.Crashlytics;

import code.template.com.Base.BaseActivity;
import code.template.com.R;
import io.fabric.sdk.android.Fabric;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Fabric.with(this, new Crashlytics());
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "测试上传项目到github", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "测试上传项目到github", Toast.LENGTH_SHORT).show();
    }
}
