package com.example.sakshi.websearchintent;

import android.app.SearchManager;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText text;          //declaring components
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text=(EditText)findViewById(R.id.searchtext);           //associating components
        button=(Button)findViewById(R.id.search);
        button.setOnClickListener(new View.OnClickListener() {      //setting click listener
            @Override
            public void onClick(View v) {
                try{
                    Intent i = new Intent(Intent.ACTION_WEB_SEARCH);        //intent for web search
                    String search1 = text.getText().toString();         //getting text from edittext field
                    i.putExtra(SearchManager.QUERY,search1);            //searching the text entered
                    startActivity(i);                           //starting activity
                }catch (Exception e){
                    e.printStackTrace();
                }

            }
        });
    }
}
