package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();
            words.add(new Word("Hitam","Kuroi", R.drawable.color_black));
            words.add(new Word("Putih","Shiroi", R.drawable.color_white));
            words.add(new Word("Coklat","Chairo", R.drawable.color_brown));
            words.add(new Word("Merah","Akai", R.drawable.color_red));
            words.add(new Word("Kuning","Kiiro", R.drawable.color_mustard_yellow));
            words.add(new Word("Hijau","Midori", R.drawable.color_green));
            words.add(new Word("Biru","Aoi", R.drawable.color_gray));
            words.add(new Word("Ungu","Murasaki", R.drawable.color_dusty_yellow));

        WordAdapter adapter = new WordAdapter(this, words);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
