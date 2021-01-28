package com.example.devmobtp01;

import android.app.Activity;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
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

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.formulaire);

        formulaire = (TextView) findViewById(R.id.formulaire);
        formulaire.setText(R.string.welcome);

        name = (EditText) findViewById(R.id.name);
        name.setHint(R.string.name);
        name.setInputType(InputType.TYPE_CLASS_TEXT);

        firstName = (EditText) findViewById(R.id.firstName);
        firstName.setHint(R.string.firstName);
        firstName.setInputType(InputType.TYPE_CLASS_TEXT);

        age = (EditText) findViewById(R.id.age);
        age.setHint(R.string.age);
        age.setInputType(InputType.TYPE_CLASS_NUMBER);

        domaine = (EditText) findViewById(R.id.domain);
        domaine.setHint(R.string.domain);
        domaine.setInputType(InputType.TYPE_CLASS_TEXT);

        phone = (EditText) findViewById(R.id.num);
        phone.setHint(R.string.num);
        phone.setInputType(InputType.TYPE_CLASS_PHONE);

        validate = (Button) findViewById(R.id.ok);
        validate.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Toast.makeText(getApplicationContext(),R.string.isValidate, Toast.LENGTH_LONG).show();
            }
        });
    }

}