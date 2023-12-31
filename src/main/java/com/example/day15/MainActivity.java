package com.example.day15;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    String nodejs[] = {"React","Next","Angular","Express"};
    Spinner s;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        s= findViewById(R.id.spinner);
        s.setOnItemSelectedListener(this);

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item,nodejs);

        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        s.setAdapter(arrayAdapter);


    }


    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String item = parent.getItemAtPosition(position).toString();
        Toast.makeText(parent.getContext(),item+" "+String.valueOf(position),Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }



    //     ListView listview;
    //     String[] mobileArray={"android","java","kotlin","flutter"};
    // @Override
    // protected void onCreate(Bundle savedInstanceState) {
    //     super.onCreate(savedInstanceState);
    //     setContentView(R.layout.activity_main);


    //     ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,mobileArray);
    //     listview = findViewById(R.id.lv);
    //     listview.setAdapter(adapter);
    //     listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
    //         @Override
    //         public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
    //             String item = adapter.getItem(position);

    //             Toast.makeText(getApplicationContext(),String.valueOf(item),Toast.LENGTH_SHORT).show();
    //         }
    //     });
    // }
}
