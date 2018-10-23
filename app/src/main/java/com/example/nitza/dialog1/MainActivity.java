package com.example.nitza.dialog1;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button b1, b2, b3, b4, b5;
    LinearLayout li;
    AlertDialog.Builder ad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = (Button) findViewById(R.id.b1);
        b2 = (Button) findViewById(R.id.b2);
        b3 = (Button) findViewById(R.id.b3);
        b4 = (Button) findViewById(R.id.b4);
        b5 = (Button) findViewById(R.id.b5);
        li = (LinearLayout) findViewById(R.id.li);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.menuc) {
            Intent t = new Intent(this, Main2Activity.class);
            startActivity(t); }
        return super.onOptionsItemSelected(item);
    }

    public void bb1(View view) {
        ad = new AlertDialog.Builder(this);
        ad.setTitle("this is a simple massage");
        ad.setMessage("hello");
        AlertDialog a = ad.create();
        ad.show();
    }

    public void bb2(View view) {
        ad = new AlertDialog.Builder(this);
        ad.setTitle("this is a simple massage");
        ad.setMessage("hello");
        ad.setIcon(R.drawable.envelope);
        AlertDialog a = ad.create();
        ad.show();
    }

    public void bb3(View view) {
        ad = new AlertDialog.Builder(this);
        ad.setTitle("this is a simple massage");
        ad.setMessage("hello");
        ad.setIcon(R.drawable.envelope);
        ad.setPositiveButton("ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();

            }
        });
        AlertDialog a = ad.create();
        ad.show();
    }


    public void bb4(View view) {
        ad = new AlertDialog.Builder(this);
        ad.setTitle("שינוי רקע");
        ad.setMessage("שנה צבע");
        ad.setIcon(R.drawable.envelope);
        ad.setPositiveButton("color", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Random rnd = new Random();
                li.setBackgroundColor(Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256)));
            }
        });
        ad.setNegativeButton("cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();

            }
        });
        AlertDialog a = ad.create();
        ad.show();

    }

    public void bb5(View view) {
        ad = new AlertDialog.Builder(this);
        ad.setTitle("שינוי רקע");
        ad.setMessage("שנה צבע");
        ad.setIcon(R.drawable.envelope);
        ad.setPositiveButton("color", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Random rnd = new Random();
                li.setBackgroundColor(Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256)));
            }
        });
        ad.setNeutralButton("cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();

            }
        });
        ad.setNegativeButton("background", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                li.setBackgroundColor(Color.WHITE); }
        });
        AlertDialog a = ad.create();
        ad.show();
        }
}
