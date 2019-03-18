package com.example.administrator.displayintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
//        //取出第一个activity传递过来的数据
//        Intent intent = getIntent();
//        String data = intent.getStringExtra("extra_data");
//        Log.d("SecondActivity",data);
//        Button button2 = (Button) findViewById(R.id.button2);
//        button2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent();
//                intent.putExtra("data_return", "helloFirstActivity");
//                setResult(RESULT_OK, intent);//专门用于向上一个活动返回数据，第一个参数用于向上一个活动返回处理结果，第二个参数把带有数据的intent传递回去
//                finish();//销毁当前活动
//            }
//        });

    }

    //back键返回数据
    @Override
    public void onBackPressed() {
        Intent intent = new Intent();
        intent.putExtra("data_return", "helloFirstActivity");
        setResult(RESULT_OK, intent);
        finish();
    }
}
