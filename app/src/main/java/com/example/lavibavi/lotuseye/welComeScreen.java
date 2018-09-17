package com.example.lavibavi.lotuseye;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;

public class welComeScreen extends AppCompatActivity {

    private android.widget.EditText _user;
    private android.widget.EditText _pass;
    private android.widget.Button _Login;
    private int count;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wel_come_screen);


        _user = (EditText)findViewById(R.id.UserText);
        _pass = (android.widget.EditText)findViewById(R.id.PassText);
        _Login = (android.widget.Button)findViewById(R.id.loginButton);


        _Login.setOnClickListener(new View.OnClickListener()) {
            @Override
            public void onClick(View view)   {
                validate(User.getText().toString(), )
            }
        }

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    g

    private void validate(String userName, String passWord) {
        if (userName == "Admin" && passWord == "hk!08") {
            android.content.Intent intent = new android.content.Intent(welComeScreen.this, AppScreen.class);
            startActivity(intent);
        } else {
            count--;
            if (count == 0) {
                _Login.setEnabled(false);

            }
        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_wel_come_screen, menu);
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
}
