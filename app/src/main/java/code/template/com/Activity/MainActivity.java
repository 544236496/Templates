package code.template.com.Activity;

import android.os.Bundle;
import android.widget.Toast;

import code.template.com.Base.BaseActivity;
import code.template.com.R;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "测试上传项目到github", Toast.LENGTH_SHORT).show();
    }
}
