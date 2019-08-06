package com.example.halloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onOk(View view)
    {
        Toast msg = Toast.makeText(this,"eu sou a Bianca",Toast.LENGTH_LONG);
        msg.show();
    }

}
