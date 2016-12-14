package com.example.iiyamanaoki.testproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

//アプリ起動に呼び出される画面のクラス
//画面レイアウトファイル res/layout/activity_main.xml
public class MainActivity extends AppCompatActivity {

    @Override
    //画面が作成されるときに呼ばれるメソッド
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}
