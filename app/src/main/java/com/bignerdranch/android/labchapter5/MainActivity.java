package com.bignerdranch.android.labchapter5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    //two variablaes for EditText and Button
private EditText mEditTextContent;
private Button mButtonLaunchSecondActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //when the user clicks the button, we want to launch the second activity and pass the data

        //bins the variable with the widgets

        mEditTextContent=(EditText) findViewById(R.id.textContent);
        mButtonLaunchSecondActivity=(Button) findViewById(R.id.buttonLaunchSecondActivity);
        mButtonLaunchSecondActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //get edit text content
                String s =mEditTextContent.getText().toString();
                //use Intent Object to describe the new activity
               /*Intent intent=new
                        Intent(MainActivity.this,SecondActivity.class);*/
               Intent intent=SecondActivity.newIntent(MainActivity.this, s);
                startActivity(intent);

            }


});}}


