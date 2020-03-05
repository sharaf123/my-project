package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class Activity2 extends AppCompatActivity {
    ListView listview;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        listview=(ListView)findViewById(R.id.listview);
        String[] values = new String[] {"Android", "iphone","windows","bluckberry","Linux"};
        ArrayAdapter<String> adapter= new ArrayAdapter<String>(this,
                android.R.layout.activity_list_item,android.R.id.text1,values);
        listview.setAdapter(adapter);
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position==0){
                    Intent intent= new Intent(view.getContext(),Android.class);
                    startActivityForResult(intent,0);
                }

                if (position==1){
                    Intent intent= new Intent(view.getContext(),iphone.class);
                    startActivityForResult(intent,1);
                }

                if (position==2){
                    Intent intent= new Intent(view.getContext(),windows.class);
                    startActivityForResult(intent,2);
                }

                if (position==3){
                    Intent intent= new Intent(view.getContext(),bluckberry.class);
                    startActivityForResult(intent,3);
                }

                if (position==4){
                    Intent intent= new Intent(view.getContext(),Linux.class);
                    startActivityForResult(intent,4);
                }
            }
        });

    }

}