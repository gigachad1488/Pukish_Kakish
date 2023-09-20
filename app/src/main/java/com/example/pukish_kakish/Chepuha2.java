package com.example.pukish_kakish;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Chepuha2 extends AppCompatActivity {

    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chepuha2);

        listView = findViewById(R.id.govnoosla);

        Chepuha2();

        Button b = findViewById(R.id.btn);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Chepuha2.this, MainActivity.class));
            }
        });
    }

    public  void Chepuha2()
    {
        List<String> shepuhasi = new ArrayList<String>();
        Random rand = new Random();
        int i = rand.nextInt(100);
        int e = rand.nextInt(100);
        while (i != e)
        {
            String j = "";
            j += Integer.toString(rand.nextInt(500));
            j += Integer.toString(rand.nextInt(500));
            j += Integer.toString(rand.nextInt(500));
            i = rand.nextInt(100);
            shepuhasi.add(j);
        };

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, shepuhasi);

        listView.setAdapter(adapter);
    }
}