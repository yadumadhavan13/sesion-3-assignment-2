package com.example.y.vibgyorbuttons;

import android.nfc.Tag;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import static android.widget.Toast.*;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button mvioletbutton;
    private Button mindigobutton;
    private Button mbluebutton;
    private Button mgreenbutton;
    private Button myellowbutton;
    private Button morangebutton;
    private Button mredbutton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mvioletbutton = (Button) findViewById(R.id.violetbutton);
        mindigobutton = (Button) findViewById(R.id.indigobutton);
        mbluebutton = (Button) findViewById(R.id.bluebutton);
        mgreenbutton = (Button) findViewById(R.id.greenbutton);
        myellowbutton = (Button) findViewById(R.id.yellowbutton);
        morangebutton = (Button) findViewById(R.id.orangebutton);
        mredbutton = (Button) findViewById(R.id.redbutton);

        mvioletbutton.setTag("viloet button");
        mindigobutton.setTag("indigo button");
        mbluebutton.setTag("Blue button");
        mgreenbutton.setTag("Green button");
        myellowbutton.setTag("Yellow button");
        morangebutton.setTag("Orange button");
        mredbutton.setTag("Red button");

        mvioletbutton.setOnClickListener(this);
        mindigobutton.setOnClickListener(this);
        mbluebutton.setOnClickListener(this);
        mgreenbutton.setOnClickListener(this);
        myellowbutton.setOnClickListener(this);
        morangebutton.setOnClickListener(this);
        mredbutton.setOnClickListener(this);




    }


    @Override
    public void onClick(View v) {


        Toast.makeText(this, "The "+v.getTag() + " is clicked", Toast.LENGTH_SHORT).show();
        Log.e("MainActivity","The "+v.getTag()+" is clicked");

            }
        }






