package com.example.awsaf.creditcard;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }

    public void TestingClk(View view) {
        Toast.makeText(this, "Clicked", Toast.LENGTH_SHORT).show();
        startActivity(new Intent(MainActivity.this , CheckOutActivity.class));
    }
}
