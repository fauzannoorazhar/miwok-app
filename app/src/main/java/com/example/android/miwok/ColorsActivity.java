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
            words.add(new Word("Hitam","Kuroi"));
            words.add(new Word("Putih","Shiroi"));
            words.add(new Word("Coklat","Chairo"));
            words.add(new Word("Merah","Akai"));
            words.add(new Word("Orange","Orenji"));
            words.add(new Word("Pink","Pinku"));
            words.add(new Word("Kuning","Kiiro"));
            words.add(new Word("Hijau","Midori"));
            words.add(new Word("Biru","Aoi"));
            words.add(new Word("Ungu","Murasaki"));

        WordAdapter adapter = new WordAdapter(this, words);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
