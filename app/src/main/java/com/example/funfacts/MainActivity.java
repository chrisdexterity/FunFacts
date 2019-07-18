package com.example.funfacts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private FactBook mfactbook=new FactBook();
    private ColorWheel mcolorwheel=new ColorWheel();
    TextView Mtext,mtext2;
    Button Mbtn;
    RelativeLayout mRelativeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Mtext=findViewById(R.id.mdid);
        mtext2=findViewById(R.id.mshow);
        Mbtn=findViewById(R.id.mbutton);

        //the buton has been clicked perform the next action
        View.OnClickListener listener= new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fact=mfactbook.getfact();
                int color=mcolorwheel.getcolors();

                //update the screen with a new fact
                Mbtn.setText(fact);
                mRelativeLayout.setBackgroundColor(color);
                Mbtn.setTextColor(color);

            }
        };

        Mbtn.setOnClickListener(listener);
    }
}
