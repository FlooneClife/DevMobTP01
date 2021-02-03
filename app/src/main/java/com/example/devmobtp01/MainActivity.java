    package com.example.devmobtp01;

import android.app.Activity;
import android.content.DialogInterface;
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

import androidx.appcompat.app.AlertDialog;

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
                valider();
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

    private void valider() {
        AlertDialog.Builder popup = new AlertDialog.Builder(MainActivity.this, R.style.AlertDialogTheme);
        popup.setMessage(R.string.confirm);
        popup.setPositiveButton(R.string.yes, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Intent intent = new Intent(MainActivity.this, AfficherFormulaire.class);
                intent.putExtra("name", name.getText().toString());
                intent.putExtra("firstName", firstName.getText().toString());
                intent.putExtra("age", age.getText().toString());
                intent.putExtra("skills", domaine.getText().toString());
                intent.putExtra("phone", phone.getText().toString());
//                Toast.makeText(getApplicationContext(), R.string.isValidate, Toast.LENGTH_LONG).show();
                startActivity(intent);
            }
        });
        popup.setNegativeButton(R.string.no, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
            }
        });
        popup.show();
    }

}