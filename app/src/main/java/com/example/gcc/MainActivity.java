package com.example.gcc;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private CardView mofaDown,mofaUpdate,slipDown,chackMedical,visaCheck,ticaCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mofaDown=findViewById(R.id.downloadmofa);
        mofaUpdate=findViewById(R.id.viewmofaupdate);
        slipDown=findViewById(R.id.downloadslip);
        chackMedical=findViewById(R.id.viewmedicalstatus);
        visaCheck=findViewById(R.id.chackvisa);
        ticaCard=findViewById(R.id.downloadtica);
        // set listener
        mofaDown.setOnClickListener(this);
        mofaUpdate.setOnClickListener(this);
        slipDown.setOnClickListener(this);
        chackMedical.setOnClickListener(this);
        visaCheck.setOnClickListener(this);
        ticaCard.setOnClickListener(this);


    }

    @Override

    public void onClick(View v) {
        if (v.getId()==R.id.downloadmofa)
        { Intent intent= new Intent(MainActivity.this,MofaDown.class);
        startActivity(intent);

        }
        else if (v.getId()==R.id.viewmofaupdate)
        {
            Intent intent= new Intent(MainActivity.this,MofaUpdate.class);
            startActivity(intent);

        }
        else if (v.getId()==R.id.downloadslip)
        {
            Intent intent= new Intent(MainActivity.this,PrintSlip.class);
            startActivity(intent);
        }
        else if (v.getId()==R.id.viewmedicalstatus)
        {
            Intent intent= new Intent(MainActivity.this,CheckMedical.class);
            startActivity(intent);
        }
        else if (v.getId()==R.id.chackvisa)
        {
            Intent intent= new Intent(MainActivity.this,VisaCheck.class);
            startActivity(intent);
        }
        else if (v.getId()==R.id.downloadtica)
        {
            Intent intent= new Intent(MainActivity.this,TicaCard.class);
            startActivity(intent);
        }

    }
}