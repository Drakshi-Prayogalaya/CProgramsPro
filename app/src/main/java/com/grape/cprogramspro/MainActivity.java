package com.grape.cprogramspro;

import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;



public class MainActivity extends ActionBarActivity
{

    Button b1;
    TextView tv,tva;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv, tva;

        tva = (TextView) findViewById(R.id.textView1);
        tv = (TextView) findViewById(R.id.textView3);

        String fontpath = "Hattori Hanzo.otf";
        Typeface tf = Typeface.createFromAsset(getAssets(), fontpath);

        tv.setTypeface(tf);
        tva.setTypeface(tf);

        b1 = (Button) findViewById(R.id.button1);
        final Intent i = getIntent();


        if(i.hasExtra("c1"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            tv.setText(i.getStringExtra("c1"));
            tva.setText("1. C program to sort the array of structures"); 
        }


        if(i.hasExtra("c2"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            tv.setText(i.getStringExtra("c2"));
            tva.setText("2. Find the sum of two arrays using Dynamic Memory Allocation"); 
        }


        if(i.hasExtra("c3"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            tv.setText(i.getStringExtra("c3"));
            tva.setText("3. C program to implement Stack using Arrays"); 
        }


        if(i.hasExtra("c4"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            tv.setText(i.getStringExtra("c4"));
            tva.setText("4. C program to remove duplicate element in an array"); 
        }


        if(i.hasExtra("c5"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            tv.setText(i.getStringExtra("c5"));
            tva.setText("5. C program to sort the matrix rows and columns"); 
        }


        if(i.hasExtra("c6"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            tv.setText(i.getStringExtra("c6"));
            tva.setText("6. C program to illustrate swapping of two arrays"); 
        }


        if(i.hasExtra("c7"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            tv.setText(i.getStringExtra("c7"));
            tva.setText("7. C program to read data and store it in a file"); 
        }


        if(i.hasExtra("c8"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            tv.setText(i.getStringExtra("c8"));
            tva.setText("8. C program to find the maximum number in an array"); 
        }


        if(i.hasExtra("c9"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            tv.setText(i.getStringExtra("c9"));
            tva.setText("9. C program to demonstrate operation on array"); 
        }


        if(i.hasExtra("c10"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            tv.setText(i.getStringExtra("c10"));
            tva.setText("10. C program to insert a given number in the array"); 
        }


        if(i.hasExtra("c11"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            tv.setText(i.getStringExtra("c11"));
            tva.setText("11. Highest and least number in array"); 
        }


        if(i.hasExtra("c12"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            tv.setText(i.getStringExtra("c12"));
            tva.setText("12. C program to find the average of elements of an array"); 
        }


        if(i.hasExtra("c13"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            tv.setText(i.getStringExtra("c13"));
            tva.setText("13. C program to create an array"); 
        }


        if(i.hasExtra("c14"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            tv.setText(i.getStringExtra("c14"));
            tva.setText("14. C program to initialize an array in declaration"); 
        }


        if(i.hasExtra("c15"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            tv.setText(i.getStringExtra("c15"));
            tva.setText("15. C program to initialize an array using FOR loop"); 
        }


        if(i.hasExtra("c16"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            tv.setText(i.getStringExtra("c16"));
            tva.setText("16. C program to read data into array using SCANF"); 
        }


        if(i.hasExtra("c17"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            tv.setText(i.getStringExtra("c17"));
            tva.setText("17. C program to get the address of an array"); 
        }


        if(i.hasExtra("c18"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            tv.setText(i.getStringExtra("c18"));
            tva.setText("18. C program to access an array using pointers"); 
        }


        if(i.hasExtra("c19"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            tv.setText(i.getStringExtra("c19"));
            tva.setText("19. C program to demonstrate the merging of two sorted lists"); 
        }


        if(i.hasExtra("c20"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            tv.setText(i.getStringExtra("c20"));
            tva.setText("20. C program to perform the inverse of a list"); 
        }


        if(i.hasExtra("c21"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            tv.setText(i.getStringExtra("c21"));
            tva.setText("21. Addition of the elements of the list"); 
        }


        if(i.hasExtra("c22"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            tv.setText(i.getStringExtra("c22"));
            tva.setText("22. Address of each element in an array"); 
        }


        if(i.hasExtra("c23"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            tv.setText(i.getStringExtra("c23"));
            tva.setText("23. C program to illustrate Arrays of strings"); 
        }


        if(i.hasExtra("c24"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            tv.setText(i.getStringExtra("c24"));
            tva.setText("24. C program for Binary to Octal conversion"); 
        }


        if(i.hasExtra("c25"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            tv.setText(i.getStringExtra("c25"));
            tva.setText("25. C program for Decimal to Hexadecimal conversion");
        }


        if(i.hasExtra("c26"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            tv.setText(i.getStringExtra("c26"));
            tva.setText("26. C program for Decimal to Octal conversion"); 
        }


        if(i.hasExtra("c27"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            tv.setText(i.getStringExtra("c27"));
            tva.setText("27. C program for Decimal to Binary conversion"); 
        }


        if(i.hasExtra("c28"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            tv.setText(i.getStringExtra("c28"));
            tva.setText("28. C program for Binary to Decimal conversion"); 
        }


        if(i.hasExtra("c29"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            tv.setText(i.getStringExtra("c29"));
            tva.setText("29. C program for Decimal to Hexadecimal conversion"); 
        }


        if(i.hasExtra("c30"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            tv.setText(i.getStringExtra("c30"));
            tva.setText("30. C program for Decimal to Binary conversion"); 
        }


        if(i.hasExtra("c31"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            tv.setText(i.getStringExtra("c31"));
            tva.setText("31. C program to find the sum of given H.P."); 
        }


        if(i.hasExtra("c32"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            tv.setText(i.getStringExtra("c32"));
            tva.setText("32. C program to find the sum of given G.P."); 
        }


        if(i.hasExtra("c33"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            tv.setText(i.getStringExtra("c33"));
            tva.setText("33. C program to find the sum of given A.P."); 
        }


        if(i.hasExtra("c34"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            tv.setText(i.getStringExtra("c34"));
            tva.setText("34. C program to find the sum of series 1^3 + 2^3 +.....+ n^3"); 
        }


        if(i.hasExtra("c35"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            tv.setText(i.getStringExtra("c35"));
            tva.setText("35. C program to find the sum of series 1^2 + 2^2 +......+ n^2"); 
        }


        if(i.hasExtra("c36"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            tv.setText(i.getStringExtra("c36"));
            tva.setText("36. C program to find the sum of series 1 + 2 +......+ n"); 
        }


        if(i.hasExtra("c37"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            tv.setText(i.getStringExtra("c37"));
            tva.setText("37. C program to print series using function"); 
        }


        if(i.hasExtra("c38"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            tv.setText(i.getStringExtra("c38"));
            tva.setText("38. C program to find Fibonacci Series"); 
        }


        if(i.hasExtra("c39"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            tv.setText(i.getStringExtra("c39"));
            tva.setText("39. C program to demonstrate the use of Switch Case"); 
        }


        if(i.hasExtra("c40"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            tv.setText(i.getStringExtra("c40"));
            tva.setText("40. C program to illustrate simple calculator, using switch-case statement"); 
        }


        if(i.hasExtra("c41"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            tv.setText(i.getStringExtra("c41"));
            tva.setText("41. C program of a Menu Driven Program using switch statement"); 
        }


        if(i.hasExtra("c42"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            tv.setText(i.getStringExtra("c42"));
            tva.setText("42. C program to check given string is palindrome or not"); 
        }


        if(i.hasExtra("c43"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            tv.setText(i.getStringExtra("c43"));
            tva.setText("43. C program which produces itself as output"); 
        }


        if(i.hasExtra("c44"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            tv.setText(i.getStringExtra("c44"));
            tva.setText("44. C program to print HELLO WORLD without using semicolon"); 
        }


        if(i.hasExtra("c45"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            tv.setText(i.getStringExtra("c45"));
            tva.setText("45. C program to Find Factorial of a number"); 
        }


        if(i.hasExtra("c46"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            tv.setText(i.getStringExtra("c46"));
            tva.setText("46. C program to solve a quadratic equation"); 
        }


        if(i.hasExtra("c47"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            tv.setText(i.getStringExtra("c47"));
            tva.setText("47. C program to print the Pascal triangle"); 
        }


        if(i.hasExtra("c48"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            tv.setText(i.getStringExtra("c48"));
            tva.setText("48. C program to print ASCII value"); 
        }


        if(i.hasExtra("c49"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            tv.setText(i.getStringExtra("c49"));
            tva.setText("49. C program to find power of a number using recursion"); 
        }


        if(i.hasExtra("c50"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            tv.setText(i.getStringExtra("c50"));
            tva.setText("50. C program to find the maximum number out of N numbers using pointers"); 
        }


        if(i.hasExtra("c51"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            tv.setText(i.getStringExtra("c51"));
            tva.setText("51. C program to compute the average of N numbers"); 
        }


        if(i.hasExtra("c52"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            tv.setText(i.getStringExtra("c52"));
            tva.setText("52. C program to check if a number is prime or not using function"); 
        }


        if(i.hasExtra("c53"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            tv.setText(i.getStringExtra("c53"));
            tva.setText("53. C program to add three numbers using function"); 
        }


        if(i.hasExtra("c54"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            tv.setText(i.getStringExtra("c54"));
            tva.setText("54. C program to check if a number is Armstrong or not"); 
        }


        if(i.hasExtra("c55"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            tv.setText(i.getStringExtra("c55"));
            tva.setText("55. C program to check if a number is prime or not"); 
        }


        if(i.hasExtra("c56"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            tv.setText(i.getStringExtra("c56"));
            tva.setText("56. C program to print the prime numbers"); 
        }


        if(i.hasExtra("c57"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            tv.setText(i.getStringExtra("c57"));
            tva.setText("57. C program to find lowest number from three given numbers"); 
        }



        if(i.hasExtra("c58"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            tv.setText(i.getStringExtra("c58"));
            tva.setText("58. C program to add the even numbers"); 
        }


        if(i.hasExtra("c59"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            tv.setText(i.getStringExtra("c59"));
            tva.setText("59. C program to add the odd numbers"); 
        }


        if(i.hasExtra("c60"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            tv.setText(i.getStringExtra("c60"));
            tva.setText("60. C program to print the even numbers"); 
        }


        if(i.hasExtra("c61"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            tv.setText(i.getStringExtra("c61"));
            tva.setText("61. C program to print the odd numbers"); 
        }


        if(i.hasExtra("c62"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            tv.setText(i.getStringExtra("c62"));
            tva.setText("62. C program to reverse a given number"); 
        }


        if(i.hasExtra("c63"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            tv.setText(i.getStringExtra("c63"));
            tva.setText("63. C program to find the sum of digits"); 
        }


        if(i.hasExtra("c64"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            tv.setText(i.getStringExtra("c64"));
            tva.setText("64. C program to print natural numbers upto a given number"); 
        }


        if(i.hasExtra("c65"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            tv.setText(i.getStringExtra("c65"));
            tva.setText("65. C program to check leap year or not"); 
        }


        if(i.hasExtra("c66"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            tv.setText(i.getStringExtra("c66"));
            tva.setText("66. C program to check if a number is odd or even"); 
        }


        if(i.hasExtra("c67"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            tv.setText(i.getStringExtra("c67"));
            tva.setText("67. C program to reverse the order of each word of the string using pointers"); 
        }


        if(i.hasExtra("c68"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            tv.setText(i.getStringExtra("c68"));
            tva.setText("68. C program to reverse a string using pointers"); 
        }


        if(i.hasExtra("c69"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            tv.setText(i.getStringExtra("c69"));
            tva.setText("69. C program to find the maximum number out of n numbers"); 
        }


        if(i.hasExtra("c70"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            tv.setText(i.getStringExtra("c70"));
            tva.setText("70. C program to swap the address of two variables using pointers"); 
        }


        if(i.hasExtra("c71"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            tv.setText(i.getStringExtra("c71"));
            tva.setText("71. C program to sort n given numbers using pointers"); 
        }


        if(i.hasExtra("c72"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            tv.setText(i.getStringExtra("c72"));
            tva.setText("72. C program to check given string is palindrome or not"); 
        }


        mymarquee(tva);


    }

    public void mymarquee(TextView t)
    {
        t.setSelected(true);
        t.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        t.setSingleLine(true);
        t.setMarqueeRepeatLimit(999999999);
    }

    public void programmer(View v)
    {
        b1 = (Button)findViewById(R.id.button1);
        Intent i = new Intent(MainActivity.this,explist.class);
        startActivity(i);
        finish();

    }

    public void mailer(View v)
    {
        b1 = (Button)findViewById(R.id.button2);


        android.support.v7.app.AlertDialog.Builder alertDialogBuilder = new android.support.v7.app.AlertDialog.Builder(this);
        alertDialogBuilder.setMessage("Your rating matters us a lot. Support us by rating.");

        alertDialogBuilder.setNegativeButton("Rate Now", new DialogInterface.OnClickListener()
        {
            @Override
            public void onClick(DialogInterface arg0, int arg1)
            {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                //Try Google play
                // intent.setData(Uri.parse("market://details?id=[Id]"));
                // if (!MyStartActivity(intent))
                //{
                //Market (Google play) app seems not installed, let's try to open a webbrowser
                intent.setData(Uri.parse("https://play.google.com/store/apps/details?id=com.grape.cprogramspro"));
                if (!MyStartActivity(intent))
                {
                    //Well if this also fails, we have run out of options, inform the user.
                    Toast.makeText(MainActivity.this, "Could not open Google Play store.", Toast.LENGTH_SHORT).show();
                }
                //}


            }
        });

        alertDialogBuilder.setPositiveButton("May be later",new DialogInterface.OnClickListener()
        {
            @Override
            public void onClick(DialogInterface dialog, int which)
            {
                Intent i = new Intent(MainActivity.this,contactus.class);
                startActivity(i);
                finish();
            }
        });

        android.support.v7.app.AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
    }


    @Override
    public void onBackPressed()
    {
        // TODO Auto-generated method stub
        super.onBackPressed();
         //Adbuddiz.showAd(this);
        Intent i = new Intent(MainActivity.this,explist.class);
        startActivity(i);
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
