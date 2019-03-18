package com.example.administrator.displayintent;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button bt1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt1 = (Button) findViewById(R.id.button1);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //显示intent
//                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                //隐式intent
//                Intent intent = new Intent("com.example.administrator.displayintent.ACTION_START");
                //使用intent调用系统浏览器访问指定网页
//                Intent intent = new Intent(Intent.ACTION_VIEW);
                //Uri.parse() 是将一个字符串解析为一个uri对象，再调用setData（）方法将uri传进去
//                intent.setData(Uri.parse("http://www.baidu.com"));
                //
                //调用系统拨号盘
//                Intent intent = new Intent(Intent.ACTION_DIAL);
//                intent.setData(Uri.parse("tel:10086"));
                //向下一个activity传递数据
                String data = "hello secondActivity";
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
//                intent.putExtra("extra_data", data);
                // startActivity(intent);
                //返回数据给上一个活动
                startActivityForResult(intent, 1);


            }
        });
    }

    /**
     *
     *
     * @param requestCode 启动活动时传入的请求码
     * @param resultCode 返回数据时传入的处理结果
     * @param data 携带者返回数据的intent
     */

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch (requestCode) {
            case 1:
                if (resultCode == RESULT_OK) {
                    String returnData = data.getStringExtra("data_return");
                    Log.d("FirstAcitivity", returnData);
                }
                break;
            default:
        }
    }


}
