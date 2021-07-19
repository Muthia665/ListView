package com.example.user.listview;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class AdapterList extends ArrayAdapter {
    private final Activity activity;
    private final String [] nama;
    private final int [] gambar;
    private final int[] keterangan;

    public AdapterList(Activity activity, String[] nama, int[] gambar, int[] keterangan) {
        super(activity, R.layout.listitem,nama);
        this.activity = activity;
        this.nama = nama;
        this.gambar = gambar;

        this.keterangan = keterangan;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater = activity.getLayoutInflater();
        View view = layoutInflater.inflate(R.layout.listitem,null,true);
        TextView txt = view.findViewById(R.id.textItem);
        ImageView img = view.findViewById(R.id.imgItem);

        txt.setText(nama[position]);
        img.setImageResource(gambar[position]);


        return view;

    }
}

