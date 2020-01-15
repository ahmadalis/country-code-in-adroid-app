package com.ahmad.github_helps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class A2_CountryCode_AddNum extends AppCompatActivity {

    Button saveNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.a2_country_code_activity);

        saveNumber = (Button) findViewById(R.id.save_num);
        saveNumber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "New Number registered successfully", Toast.LENGTH_SHORT).show();
            }
        });


    }
}
