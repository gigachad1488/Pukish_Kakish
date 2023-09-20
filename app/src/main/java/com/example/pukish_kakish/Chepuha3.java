package com.example.pukish_kakish;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class Chepuha3 extends AppCompatActivity {

    ArrayList<Lake> lakes = new ArrayList<Lake>();
    ListView lakesListV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chepuha3);

        setInitialData();

        lakesListV = findViewById(R.id.list);

        LakeAdapter adapter = new LakeAdapter(this, R.layout.bimbam698, lakes);

        lakesListV.setAdapter(adapter);

        Button b = findViewById(R.id.btn);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Chepuha3.this, MainActivity.class));
            }
        });
    }
    private void setInitialData(){

        lakes.add(new Lake("Амазонк", "amerika", R.drawable.noname));
        lakes.add(new Lake("Амур", "восточный сибир", R.drawable.cean));
        lakes.add(new Lake("Вента", "лавия", R.drawable.pomidor));
        lakes.add(new Lake("Ганг", "hindi", R.drawable.ruan_hosling));


    }
}