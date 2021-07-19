package com.example.user.listview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    TextView txtnama, txtket;
    ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        txtnama = findViewById(R.id.txtDetail);
        txtket = findViewById(R.id.ketDetail);
        img = findViewById(R.id.imgDetail);

        Intent a = getIntent();
        String nama = a.getStringExtra("nama");
        int gambar = a.getIntExtra("gambar", 0);
        int keterangan = a.getIntExtra("keterangan", 0);

        txtnama.setText(nama);
        img.setImageResource(gambar);
        txtket.setText(keterangan);

    }
}
