package com.example.devmobtp01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class Exercice7 extends AppCompatActivity {

    EditText call;
    ImageView phone;
    TextView text;
    Button ok;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercice7);

        call = (EditText) findViewById(R.id.phoneEntry);
        phone = (ImageView) findViewById(R.id.img);
        text = (TextView) findViewById(R.id.appeler);
        ok = (Button) findViewById(R.id.phoneValidate);


        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Uri c = Uri.parse("tel:" + call.getText().toString());
                Intent goCall = new Intent(Intent.ACTION_DIAL, c);
                startActivity(goCall);
            }
        });

    }

}