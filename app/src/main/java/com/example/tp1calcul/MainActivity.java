package com.example.tp1calcul;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    Button _btnSom;
    EditText _edtPremier,_edtSecond;
    TextView _txtResultat;
    Button _btnSous;
    Button _btnMul;
    Button _btnDiv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //liaison entre contrôles XML et variables Java
        _btnSom = findViewById(R.id.btnSom);
        _btnSous = findViewById(R.id.btnSou);
        _btnMul = findViewById(R.id.btnMul);
        _btnDiv = findViewById(R.id.btnDiv);
        _edtPremier = findViewById(R.id.edtPremier);
        _edtSecond = findViewById(R.id.edtSecond);
        _txtResultat = findViewById(R.id.txtResultat);

        // traitements
        _btnSom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n1,n2,somme;
                n1 = Integer.parseInt(_edtPremier.getText().toString());
                n2 = Integer.parseInt(_edtSecond.getText().toString());
                somme = n1 + n2;
                _txtResultat.setText("Le résultat est : " + String.valueOf(somme));
            }
        });

        _btnSous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n1,n2,result;
                n1 = Integer.parseInt(_edtPremier.getText().toString());
                n2 = Integer.parseInt(_edtSecond.getText().toString());
                result = n1 - n2;
                _txtResultat.setText("Le résultat est : " + String.valueOf(result));
            }

        });
        _btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n1,n2,Mul;
                n1 = Integer.parseInt(_edtPremier.getText().toString());
                n2 = Integer.parseInt(_edtSecond.getText().toString());
                Mul = n1 * n2;
                _txtResultat.setText("Le résultat est : " + String.valueOf(Mul));
            }
        });
        _btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n1,n2,Div;
                n1 = Integer.parseInt(_edtPremier.getText().toString());
                n2 = Integer.parseInt(_edtSecond.getText().toString());
                Div = n1 / n2;
                _txtResultat.setText("Le résultat est : " + String.valueOf(Div));
            }
        });
    }
}