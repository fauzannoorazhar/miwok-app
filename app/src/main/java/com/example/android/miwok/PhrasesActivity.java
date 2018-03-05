package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        /*ArrayList<Word> words = new ArrayList<Word>();
            words.add(new Word("Selamat Pagi","Ohayo Gozaimasu"));
            words.add(new Word("Selamat Siang","Konnichiwa"));
            words.add(new Word("Selamat Malam","Konbanwa"));
            words.add(new Word("Selamat Beristirahat","Oyasumi Nasai"));
            words.add(new Word("Terima Kasih","Arigato Gozaimasu"));
            words.add(new Word("Permisi/Maaf","Sumimasen"));
            words.add(new Word("Apakah Ada Air","Omizu Arimasuka"));
            words.add(new Word("Ini Ada Dimana?","Kore Doko Desuka"));
            words.add(new Word("Apakah Hari Ini Buka?","Kyo Aitemasuka"));
            words.add(new Word("Harganya Berapa","Oikura Desuka?"));

        WordAdapter adapter = new WordAdapter(this, words, R.color.category_phrases);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);*/

    }
}
