package com.grape.cprogramspro;

import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;



public class contactus extends ActionBarActivity
{
    Button b1;
    TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contactus);
        b1 = (Button)findViewById(R.id.button1);
        tv1 = (TextView)findViewById(R.id.textView9);

        String fontpath = "Monaco.ttf";
        Typeface tf = Typeface.createFromAsset(getAssets(),fontpath);

        tv1.setTypeface(tf);
    }


    @Override
    public void onBackPressed()
    {
        // TODO Auto-generated method stub
        super.onBackPressed();
        Intent i = new Intent(contactus.this,home.class);
        startActivity(i);
        finish();
    }

    public void homer(View v)
    {

        b1 = (Button)findViewById(R.id.button72);
        Intent i = new Intent(contactus.this,home.class);
        startActivity(i);
        finish();
    }

    public void facebooker(View v)
    {
        b1 = (Button)findViewById(R.id.button73);
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://www.facebook.com/GrapeEmbeddedSolutions"));
        startActivity(intent);
    }

    public void googleplayer(View v)
    {
        b1 = (Button)findViewById(R.id.button74);
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://play.google.com/store/apps/details?id=com.grape.cprogramspro"));
        startActivity(intent);
    }

    public void sharer(View v)
    {
        b1 = (Button)findViewById(R.id.button75);
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT,"Hello friends!!! Check out this application in play store. \"C Programs\" - https://play.google.com/store/apps/details?id=com.grape.cprograms");
        startActivity(Intent.createChooser(intent,"Share via"));
    }

    public void moreapper(View v)
    {
        b1 = (Button)findViewById(R.id.button74);
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://play.google.com/store/apps/developer?id=Grape+Labs"));
        startActivity(intent);
    }

    public void wordpresser(View v)
    {
        b1 = (Button)findViewById(R.id.button74);
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://grapelabs.wordpress.com"));
        startActivity(intent);
    }
}
