package com.example.user.listview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    ListView ListView;


    String nama[] = {
            "Alpukat", "Apel", "Ceri", "Durian"
    };

    int gambar[] = {
            R.drawable.alpukat, R.drawable.apel, R.drawable.ceri, R.drawable.durian
    };

    int keterangan[] = {
            R.string.ketAlpukat, R.string.ketApel, R.string.ketCeri, R.string.ketDurian
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView = findViewById(R.id.ListView);

        //adapter
        AdapterList adapterList = new AdapterList(this, nama, gambar, keterangan);
        ListView.setAdapter(adapterList);
        ListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //Toast.makeText(MainActivity.this, "Nama buah"+nama[position],Toast.LENGTH_LONG).show();
                Intent q = new Intent(getApplicationContext(), DetailActivity.class);
                q.putExtra("nama", nama[position]);

                q.putExtra("gambar", gambar[position]);
                q.putExtra("keterangan", keterangan[position]);

                startActivity(q);
            }
        });

    }
}
