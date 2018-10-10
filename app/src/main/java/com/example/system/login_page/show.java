package com.example.system.login_page;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class show extends AppCompatActivity {

    ArrayList<String> arrayList = new ArrayList<String>();
    Button clear_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);

        arrayList.add(getIntent().getExtras().getString("name"));
        arrayList.add(getIntent().getExtras().getString("email"));
        arrayList.add(getIntent().getExtras().getString("phone"));


        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,arrayList);
        ListView displayInfo = (ListView) findViewById(R.id.list);
        displayInfo.setAdapter(adapter);

        clear_back=(Button)findViewById(R.id.clear_back);
        clear_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }

        });

    }
}
