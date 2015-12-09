package com.rogcg.floatingactionbuttonsample;

import android.graphics.Color;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Snackbar snackbar = Snackbar
                        .make(v, "You clicked on a Floating Action Button!", Snackbar.LENGTH_LONG)
                        .setAction("Undo", null);
                snackbar.setActionTextColor(Color.RED);
                snackbar.show();
            }
        });
    }
}
