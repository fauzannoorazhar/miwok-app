package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();
            words.add(new Word("Ayah","Otousan/Chichi"));
            words.add(new Word("Ibu","Okaasan/Haha"));
            words.add(new Word("Kakak Laki Laki","Oniisan/Ani"));
            words.add(new Word("Kakak Perempuan","Oneesan/Ane"));
            words.add(new Word("Adik Laki Laki","Otouto"));
            words.add(new Word("Adik Perempuan","Imouto"));
            words.add(new Word("Anak Laki Laki","Musuko"));
            words.add(new Word("Anak Perempuan","Musume"));
            words.add(new Word("Suami","Shujin/Otto"));
            words.add(new Word("Istri","Okusan/Tsuma"));

        WordAdapter adapter = new WordAdapter(this, words);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
