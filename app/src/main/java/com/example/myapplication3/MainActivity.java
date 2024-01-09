package com.example.myapplication3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn;
    TextView tv;
    private int number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        number=0;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button)findViewById(R.id.button);
        tv = (TextView)findViewById(R.id.textView);
    }
    public void go(View view){
        btn.setText("THIS IS A CLICK NUMBER:");
        number+=1;
        tv.setText(""+ number);
    }
}