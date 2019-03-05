package com.example.rooms;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;




public class mymenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mymenu);

    }
    @Override
    public boolean onCreateOptionsMenu (Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected (MenuItem item){
        int x = item.getItemId();
        switch (x) {
            case R.id.home:
                Intent my = new Intent(mymenu.this, mymenu.class);
                startActivity(my);
                break;
            case R.id.view:
                Intent my1 = new Intent(mymenu.this, login.class);
                startActivity(my1);
                break;
            case R.id.set:
                Intent my2= new Intent(mymenu.this, MainActivity.class);
                startActivity(my2);
                break;


            default:
                return false;

        }

        return super.onOptionsItemSelected(item);
    }

}

