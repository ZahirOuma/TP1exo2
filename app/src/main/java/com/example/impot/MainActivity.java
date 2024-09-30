package com.example.impot;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private EditText nom;
    private EditText adresse;
    private EditText surface;
    private EditText nbrPiece;
    private Button calculer;
    private CheckBox piscine;
    private float impotDeBase=0;
    private float impotSuplaimentaire=0;
    private float impotTotal=0;
    private float ajout=0;
    private TextView t1;
    private TextView t2;
    private TextView t3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        nom=findViewById(R.id.nom);
        adresse=findViewById(R.id.adresse);
        surface=findViewById(R.id.surface);
       nbrPiece=findViewById(R.id.nbrPiece);
        piscine=findViewById(R.id.piscine);
        calculer=findViewById(R.id.calculer);
        t1=findViewById(R.id.textView6);
        t2=findViewById(R.id.textView7);
        t3=findViewById(R.id.textView8);


        calculer.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                impotDeBase=Float.parseFloat(surface.getText().toString())*2;
                if(piscine.isChecked()){
                    ajout=100;
                }else{
                    ajout=0;
                }
                impotSuplaimentaire=Float.parseFloat(nbrPiece.getText().toString())*50 + ajout;
                impotTotal=impotDeBase+impotSuplaimentaire;
                t1.setText("L impot de base est : " +impotDeBase);
                t2.setText("L impot supplementaire est : " +impotSuplaimentaire);
                t3.setText("L impot total est : " +impotTotal);




            }

        });

    }
}