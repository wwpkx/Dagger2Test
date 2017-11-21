package com.wwp.dagger2test;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.wwp.dagger2test.salad.Salad;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.tv_hello_dagger2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new Salad();
            }
        });
    }
}
