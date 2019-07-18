package com.example.funfacts;

import android.graphics.Color;

import java.util.Random;

public class ColorWheel {
    private String[] mcolors ={
            "#F30B5A",
            "#008577",
            "#00574B",
            "#F09207",
            "#EED70C",
            "#C28581" ,
            "#86F307",
            "#F0410A " ,
            "#0BD3EC"};

    public int getcolors(){

        String colors;
        //randomly select a fact
        Random randomgenerator=new Random();
        int randomnumber=randomgenerator.nextInt(mcolors.length);
        colors= mcolors[randomnumber];
        int Ascolorint= Color.parseColor(colors);
        return Ascolorint;
    }

}
