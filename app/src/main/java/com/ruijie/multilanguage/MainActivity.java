package com.ruijie.multilanguage;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;

import java.util.Locale;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
//        Resources resources = getResources();
//        Configuration config = resources.getConfiguration();
//        DisplayMetrics dm = resources.getDisplayMetrics();
//        config.locale = Locale.getDefault();
//        resources.updateConfiguration(config, dm);


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



//        Resources resources = getResources();
//        Configuration config = resources.getConfiguration();
//        DisplayMetrics dm = resources.getDisplayMetrics();
//        config.locale = Locale.SIMPLIFIED_CHINESE;
//        resources.updateConfiguration(config, dm);
    }


    public void changeClick(View v){
        Resources resources = getResources();
        Configuration config = resources.getConfiguration();
        Log.e("test",config.locale.getCountry());
        if(config.locale == Locale.SIMPLIFIED_CHINESE){
            switchLanguage("en");
        }else{
            switchLanguage("zh_simple");
        }

    }

    public void goClick(View v){
        Intent it = new Intent(MainActivity.this, Main2Activity.class);
//清空任务栈确保当前打开activit为前台任务栈栈顶
        //it.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(it);
    }
    private void switchLanguage(String language) {
//设置应用语言类型
        Resources resources = getResources();
        Configuration config = resources.getConfiguration();
        DisplayMetrics dm = resources.getDisplayMetrics();
        if (language.equals("zh_simple")) {
            config.locale = Locale.SIMPLIFIED_CHINESE;
        } else if (language.equals("en")) {
            config.locale = Locale.ENGLISH;
        } else {
            config.locale = Locale.getDefault();
        }
        resources.updateConfiguration(config, dm);

//更新语言后,destroy当前页面,重新绘制
        finish();
        Intent it = new Intent(MainActivity.this, MainActivity.class);
//清空任务栈确保当前打开activit为前台任务栈栈顶
        it.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(it);
    }

}
