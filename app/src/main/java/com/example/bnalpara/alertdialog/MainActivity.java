package com.example.bnalpara.alertdialog;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);
    }

    public void changeText(View view){
        AlertDialog.Builder alert_builder = new AlertDialog.Builder(MainActivity.this); // Create alert builder
        alert_builder.setTitle("Change Text"); //Give the Title of alert dialog
        alert_builder.setMessage("Are you sure about changing the text of text box"); //Message that we want to display to user
        alert_builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() { //What should happen if user click positive button. it is "Yes" in our case.
            @Override
            public void onClick(DialogInterface dialog, int which) {
                textView.setText("buraknalpara.com");
            }
        });
        alert_builder.setNegativeButton("No", new DialogInterface.OnClickListener() { //What should happen if user click negative button. it is "No" in our case.
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getApplicationContext(), "Operation cancelled", Toast.LENGTH_SHORT).show(); //display toast message for cancelling the operation
            }
        });

        alert_builder.show(); //Show the alert dialog
    }
}
