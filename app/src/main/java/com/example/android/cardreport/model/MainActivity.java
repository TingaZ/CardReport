package com.example.android.cardreport.model;

import android.content.Intent;
import android.database.Cursor;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.android.cardreport.Helper.DbHelper;
import com.example.android.cardreport.R;
import com.example.android.cardreport.model.MainMenu;

public class MainActivity extends AppCompatActivity {
    DbHelper myDb;
    Button btnClickMe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        myDb = new DbHelper(this);

    }

    public void nextForm(View view) {
        startActivity(new Intent(this, MainMenu.class));
    }



    public void  showMessage(String title, String message){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(title);
        builder.setMessage(message);
        builder.setCancelable(true);
        builder.show();
    }
}
