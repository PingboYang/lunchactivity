package com.bignerdranch.android.labchapter5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    private static final String EXTRA_EDITTEXT_CONTENT="com.bignerdranch.android.labchapter5.CONTENT";
    private TextView mTextViewContent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        // the getIntent() method is available to retrieve the Extra
        String s =getIntent().getStringExtra(EXTRA_EDITTEXT_CONTENT);
        mTextViewContent=(TextView) findViewById(R.id.textFromMainActivity);
        mTextViewContent.setText(s);

    }
    //create a method for MainActivity to instantiate an Intent object
    public static Intent newIntent(Context packageContext, String content){
        Intent intent=new Intent(packageContext,SecondActivity.class);
        intent.putExtra(EXTRA_EDITTEXT_CONTENT,content );
        return intent;

    }
}