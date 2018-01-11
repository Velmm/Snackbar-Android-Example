package com.example.velmurugan.snackbarsexample;

import android.graphics.Color;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private CoordinatorLayout coordinatorLayout;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        coordinatorLayout = (CoordinatorLayout)findViewById(R.id.coordinatorLayout);
        toolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }


    public void simplySnackbar(View view){

        Snackbar snackbar = Snackbar.make(coordinatorLayout,"This is Simple Snackbar",Snackbar.LENGTH_SHORT);
        snackbar.show();

    }

    public void snackbarWithAction(View view){
        Snackbar snackbar = Snackbar.make(coordinatorLayout,"Snackbar With Action",Snackbar.LENGTH_SHORT);
        snackbar.setAction("UNDO", new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Undo action",Toast.LENGTH_SHORT).show();
            }
        });
        snackbar.show();
    }

    public void customSnackbar(View view){

        Snackbar snackbar = Snackbar.make(coordinatorLayout,"Custom Snackbar",Toast.LENGTH_SHORT);
        snackbar.setAction("UNDO", new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Undo action",Toast.LENGTH_SHORT).show();
            }
        });

        snackbar.setActionTextColor(Color.BLUE);

        View snackbarView = snackbar.getView();
        TextView snackbarText = (TextView) snackbarView.findViewById(android.support.design.R.id.snackbar_text);
        snackbarText.setTextColor(Color.YELLOW);
        snackbar.show();
    }

}
