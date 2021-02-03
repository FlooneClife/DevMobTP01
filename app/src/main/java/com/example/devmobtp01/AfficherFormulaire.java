package com.example.devmobtp01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class AfficherFormulaire extends AppCompatActivity {

    TextView tvName;
    TextView tvFirstName;
    TextView tvAge;
    TextView tvDomain;
    TextView tvPhone;
    Button ok;
    Button prev;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_afficher_formulaire);

        Intent intent = getIntent();

        tvName = (TextView) findViewById(R.id.tvName);
        tvFirstName = (TextView) findViewById(R.id.tvFirstName);
        tvAge = (TextView) findViewById(R.id.tvAge);
        tvDomain = (TextView) findViewById(R.id.tvDomain);
        tvPhone = (TextView) findViewById(R.id.tvPhone);

        tvName.setText(getResources().getString(R.string.name) + " : " + intent.getStringExtra("name"));
        tvFirstName.setText(getResources().getString(R.string.firstName) + " : " + intent.getStringExtra("firstName"));
        tvAge.setText(getResources().getString(R.string.age) + " : " + intent.getStringExtra("age"));
        tvDomain.setText(getResources().getString(R.string.domain) + " : " + intent.getStringExtra("skills"));
        tvPhone.setText(getResources().getString(R.string.num) + " : " + intent.getStringExtra("phone"));

        ok = (Button) findViewById(R.id.ok);
        prev = (Button) findViewById(R.id.prev);

        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent next = new Intent(AfficherFormulaire.this, com.example.devmobtp01.Exercice7.class);
                startActivity(next);
            }
        });

        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent prev = new Intent(AfficherFormulaire.this, com.example.devmobtp01.MainActivity.class);
                finish();
            }
        });

    }

}