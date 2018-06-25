package com.example.pascal.spinnerlist1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        getSupportActionBar().setTitle(R.string.app_name);

        Spinner spinner = findViewById(R.id.spinner1);

        String[] cars = getResources().getStringArray(R.array.cars);


        ArrayAdapter<CharSequence> adapter =  ArrayAdapter.createFromResource(this,R.array.cars,android.R.layout.simple_spinner_item);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner.setAdapter(adapter);

//        spinner.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                TextView txtVw = view.findViewById(R.id.spinner1);
//                String name = txtVw.getText().toString();
//
//                if (name.equals("Orange")){
//
//                }
//                else if(name.equals("")){
//
//                }
//
//                Log.d("myLogs", txtVw.getText().toString());
//            }
//        });




    }

}
