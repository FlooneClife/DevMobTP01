package com.example.devmobtp01;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    Button valider;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.formulaire);

        valider = (Button) findViewById(R.id.ok);
        valider.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                valider();
            }
        });

    }

    private void valider() {
        AlertDialog.Builder popup = new AlertDialog.Builder(SecondActivity.this, R.style.AlertDialogTheme);
        popup.setMessage(R.string.confirm);
        popup.setPositiveButton(R.string.yes, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getApplicationContext(), R.string.isValidate, Toast.LENGTH_LONG).show();
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