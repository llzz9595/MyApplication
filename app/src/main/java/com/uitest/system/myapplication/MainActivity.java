package com.uitest.system.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
    /*
    点击按钮响应事件
     */

    public void buttonOnClick(View v ) {

        switch (v.getResources().getResourceEntryName(v.getId()))
        {
            case "button_1":   Toast.makeText(getApplicationContext(), "This button will launch POPULAR MOVIE", Toast.LENGTH_SHORT).show();
                break;
            case "button_2":   Toast.makeText(getApplicationContext(), "This button will launch STOCK HAWK", Toast.LENGTH_SHORT).show();
                break;
            case "button_3":   Toast.makeText(getApplicationContext(), "This button will launch BUILD IT BIGGER", Toast.LENGTH_SHORT).show();
                break;
            case "button_4":   Toast.makeText(getApplicationContext(), "This button will launch MAKE YOUR APP MATERIAL", Toast.LENGTH_SHORT).show();
                break;
            case "button_5":   Toast.makeText(getApplicationContext(), "This button will launch GO UBIQUITOUS", Toast.LENGTH_SHORT).show();
                break;
            case "button_6":   Toast.makeText(getApplicationContext(), "This button will launch CAPSTONE", Toast.LENGTH_SHORT).show();
                break;

        }

    }
}
