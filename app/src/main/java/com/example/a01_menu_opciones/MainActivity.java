package com.example.a01_menu_opciones;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_opciones, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.action_new_averia:
                Toast toast1 = Toast.makeText(this,"Nueva avería clicked", Toast.LENGTH_SHORT);
                toast1.show();
                return true;
            case R.id.action_averia_search:
                Toast toast2 = Toast.makeText(this,"Búsqueda de avería", Toast.LENGTH_SHORT);
                toast2.show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
