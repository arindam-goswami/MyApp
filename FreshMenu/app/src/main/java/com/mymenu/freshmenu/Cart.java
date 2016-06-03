package com.mymenu.freshmenu;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class Cart extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);
        TextView result = (TextView) findViewById(R.id.result);
        Intent i = getIntent();
        ArrayList<String> cartItem = i.getExtras().getStringArrayList("items");
        for (String item : cartItem){
            result.setText(result.getText().toString()+"\n"+item);
        }
    }
}
