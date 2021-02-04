package com.example.devmobtp01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Exercice8 extends AppCompatActivity {

    private EditText editDep;
    private EditText editArr;
    private Button ok;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercice8);

        ok = (Button) findViewById(R.id.stationValidate);
        editDep = (EditText) findViewById(R.id.editDep);
        editArr = (EditText) findViewById(R.id.editArr);

        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(Exercice8.this, Exercice8Suite.class);
                intent.putExtra("dep", editDep.getText().toString());
                intent.putExtra("arr", editArr.getText().toString());
                startActivity(intent);
            }
        });
    }

}