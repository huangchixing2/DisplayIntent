package com.example.administrator.displayintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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
                Intent intent = new Intent("com.example.administrator.displayintent.ACTION_START");
                startActivity(intent);

            }
        });
    }
}
