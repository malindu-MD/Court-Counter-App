package com.malindu.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import android.widget.Toast;

import static android.app.ProgressDialog.show;
import static android.widget.Toast.LENGTH_LONG;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);
    }
    int countofa=0;
    int countofb=0;

    public void acount(int count){

        TextView Acount=findViewById(R.id.Acount);
        Acount.setText(String.valueOf(count));
    }

    public void bcount(int count){

        TextView Bcount=findViewById(R.id.Bcount);
        Bcount.setText(String.valueOf(count));
    }

    public void Athree(View view){

        countofa+=3;
        acount(countofa);


    }
    public void Atwo(View view){

        countofa+=2;
        acount(countofa);


    }

    public void Afree(View view){

        countofa+=1;
        acount(countofa);


    }

    public void Bthree(View view){

        countofb+=3;
        bcount(countofb);


    }
    public void Btwo(View view){

        countofb+=2;
        bcount(countofb);


    }

    public void Bfree(View view){

        countofb+=1;
        bcount(countofb);


    }

    public void reset(View view){

        countofa=0;
        countofb=0;
        acount(countofa);
        bcount(countofb);


    }

    public void winner(View view){

        Context context=getApplicationContext();
        CharSequence txt1="Winner is Team A";
        CharSequence txt2="Winner is Team B";
        int duration= LENGTH_LONG;
        if(countofb < countofa){

            Toast toast=Toast.makeText(context,txt1,duration);
            toast.show();
        }

        else if (countofa<countofb){

            Toast toast=Toast.makeText(context,txt2,duration);
            toast.show();
        }





    }





}