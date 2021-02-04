package com.example.devmobtp01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

public class Exercice8Suite extends AppCompatActivity {

    private Button ok;
    private TextView dep;
    private TextView arr;
    private ListView L;
    private String[] horaires = new String[] {
            "9:00", "10:00", "11:00", "14:00", "16:00", "19:00"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercice8_suite);

        Intent i = getIntent();
        dep = (TextView) findViewById(R.id.dep);
        arr = (TextView) findViewById(R.id.arr);
        L = (ListView) findViewById(R.id.myList);
        ok = (Button) findViewById(R.id.ok);

        dep.setText(getResources().getString(R.string.stationDep) + " : " + i.getStringExtra("dep"));
        arr.setText(getResources().getString(R.string.stationArr) + " : " + i.getStringExtra("arr"));

        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(Exercice8Suite.this, android.R.layout.simple_list_item_1, horaires);
        L.setAdapter(adapter);

        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(Exercice8Suite.this, Exercice8.class);
                finish();
            }
        });
    }

}