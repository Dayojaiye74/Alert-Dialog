package com.dev_app.alertdialog;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }

    //I created a onBackPressed Method for the AlertDialog to popup..
    // its not always necessary you do it this way but for better understanding and User experience
    public  void onBackPressed(){

        //Code to display the AlertDialog

        new AlertDialog.Builder(this)
                .setTitle("Confirm")
                .setMessage("Do you want to exit close the App?")
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                                finish();
                    }
                }).setNegativeButton("No", null).show();
    }



}
