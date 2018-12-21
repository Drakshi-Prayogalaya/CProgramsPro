package com.grape.cprogramspro;

import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;




public class home extends ActionBarActivity
{
    Button b1;
    TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        tv1 = (TextView) findViewById(R.id.textView);

        String fontpath = "Monaco.ttf";
        Typeface tf = Typeface.createFromAsset(getAssets(),fontpath);

        tv1.setTypeface(tf);


    }

    public void show_the_program_list(View v)
    {
        //AdBuddiz.showAd(this);
        b1 = (Button)findViewById(R.id.button1);
        Intent i = new Intent(home.this,explist.class);
        startActivity(i);
        finish();

    }

    public void show_contacts(View v)
    {
        //AdBuddiz.showAd(this);
        b1 = (Button)findViewById(R.id.button3);

        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        alertDialogBuilder.setMessage("Your rating matters us a lot. Support us by rating.");

        alertDialogBuilder.setNegativeButton("Rate Now", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface arg0, int arg1) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                //Try Google play
                // intent.setData(Uri.parse("market://details?id=[Id]"));
                // if (!MyStartActivity(intent))
                //{
                //Market (Google play) app seems not installed, let's try to open a webbrowser
                intent.setData(Uri.parse("https://play.google.com/store/apps/details?id=com.grape.cprogramspro"));
                if (!MyStartActivity(intent)) {
                    //Well if this also fails, we have run out of options, inform the user.
                    Toast.makeText(home.this, "Could not open Google Play store.", Toast.LENGTH_SHORT).show();
                }
                //}


            }
        });

        alertDialogBuilder.setPositiveButton("May be later", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                Intent i = new Intent(home.this, contactus.class);
                startActivity(i);
                finish();
            }
        });

        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
    }

    @Override
    public void onBackPressed()
    {
        // TODO Auto-generated method stub
        super.onBackPressed();
        finish();

}

    private boolean MyStartActivity(Intent aIntent)
    {
        try
        {
            startActivity(aIntent);
            return true;
        }
        catch (ActivityNotFoundException e)
        {
            return false;
        }
    }


}
