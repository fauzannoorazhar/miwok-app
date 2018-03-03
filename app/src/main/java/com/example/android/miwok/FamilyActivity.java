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
            words.add(new Word("Ayah","Otousan/Chichi", R.drawable.family_father));
            words.add(new Word("Ibu","Okaasan/Haha", R.drawable.family_mother));
            words.add(new Word("Kakak Laki Laki","Oniisan/Ani", R.drawable.family_older_brother));
            words.add(new Word("Kakak Perempuan","Oneesan/Ane", R.drawable.family_older_sister));
            words.add(new Word("Adik Laki Laki","Otouto", R.drawable.family_younger_brother));
            words.add(new Word("Adik Perempuan","Imouto", R.drawable.family_younger_sister));
            words.add(new Word("Anak Laki Laki","Musuko", R.drawable.family_son));
            words.add(new Word("Anak Perempuan","Musume", R.drawable.family_daughter));
            words.add(new Word("Kakek","Ojichan", R.drawable.family_grandfather));
            words.add(new Word("Nenek","Sobo", R.drawable.family_grandmother));

        WordAdapter adapter = new WordAdapter(this, words);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
