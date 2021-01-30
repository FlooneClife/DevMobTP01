    package com.example.devmobtp01;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    private TextView formulaire;
    private EditText name;
    private EditText firstName;
    private EditText age;
    private EditText domaine;
    private EditText phone;
    private Button validate;

    private Button seeLayout;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //setContentView(R.layout.formulaire);

        LinearLayout LL = new LinearLayout(this);
        LL.setOrientation(LinearLayout.VERTICAL);

        formulaire = new TextView(this);
        formulaire.setText(R.string.welcome);
        formulaire.setTextSize(20);

        name = new EditText(this);
        name.setHint(R.string.name);
        name.setInputType(InputType.TYPE_CLASS_TEXT);

        firstName = new EditText(this);
        firstName.setHint(R.string.firstName);
        firstName.setInputType(InputType.TYPE_CLASS_TEXT);

        age = new EditText(this);
        age.setHint(R.string.age);
        age.setInputType(InputType.TYPE_CLASS_NUMBER);

        domaine = new EditText(this);
        domaine.setHint(R.string.domain);
        domaine.setInputType(InputType.TYPE_CLASS_TEXT);

        phone = new EditText(this);
        phone.setHint(R.string.num);
        phone.setInputType(InputType.TYPE_CLASS_PHONE);

        validate = new Button(this);
        validate.setText(R.string.validate);
        validate.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Toast.makeText(getApplicationContext(),R.string.isValidate, Toast.LENGTH_LONG).show();
            }
        });

        seeLayout = new Button(this);
        seeLayout.setText(R.string.click);
        seeLayout.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent next = new Intent(MainActivity.this, com.example.devmobtp01.SecondActivity.class);
                startActivity(next);
            }
        });

        LL.addView(formulaire);
        LL.addView(name);
        LL.addView(firstName);
        LL.addView(age);
        LL.addView(domaine);
        LL.addView(phone);
        LL.addView(validate);
        LL.addView(seeLayout);

        setContentView(LL);

    }

}