package uk.ac.solent.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /* create a textview
        TextView tv=new TextView(this);
        tv.setText("Hello World!");
        setContentView(tv);
        */
    }

    }