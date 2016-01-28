package com.example.jay.myportfolioapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button a1,a2,a3,a4,a5,a6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        a1= (Button) findViewById(R.id.button);
        a2= (Button) findViewById(R.id.button2);
        a3= (Button) findViewById(R.id.button3);
        a4= (Button) findViewById(R.id.button4);
        a5= (Button) findViewById(R.id.button5);
        a6= (Button) findViewById(R.id.button6);

        a1.setOnClickListener(this);
        a2.setOnClickListener(this);
        a3.setOnClickListener(this);
        a4.setOnClickListener(this);
        a5.setOnClickListener(this);
        a6.setOnClickListener(this);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        StringBuffer message = new StringBuffer("This button will launch ");
        if (v == a1){
            message.append("Spotify Streamer App");
        }else if(v == a2){
            message.append("Super Duo - Football App");
        }else if(v == a3){
            message.append("Super Duo - Library App");
        }else if(v == a4){
            message.append("Build It Bigger App");
        }else if(v == a5){
            message.append("XYZ Reader App");
        }else if(v == a6){
            message.append("My Capstone App!");
        }

        Toast.makeText(getApplicationContext(),message.toString(),Toast.LENGTH_LONG).show();
    }
}
