package com.example.android.miwok;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    private MediaPlayer mMediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        final ArrayList<Word> words = new ArrayList<Word>();
            words.add(new Word("Ayah","Otousan/Chichi", R.drawable.family_father, R.raw.family_father));
            words.add(new Word("Ibu","Okaasan/Haha", R.drawable.family_mother, R.raw.family_mother));
            words.add(new Word("Kakak Laki Laki","Oniisan/Ani", R.drawable.family_older_brother, R.raw.family_daughter));
            words.add(new Word("Kakak Perempuan","Oneesan/Ane", R.drawable.family_older_sister, R.raw.family_grandmother));
            words.add(new Word("Adik Laki Laki","Otouto", R.drawable.family_younger_brother, R.raw.family_father));
            words.add(new Word("Adik Perempuan","Imouto", R.drawable.family_younger_sister, R.raw.family_father));
            words.add(new Word("Anak Laki Laki","Musuko", R.drawable.family_son, R.raw.family_father));
            words.add(new Word("Anak Perempuan","Musume", R.drawable.family_daughter, R.raw.family_father));
            words.add(new Word("Kakek","Ojichan", R.drawable.family_grandfather, R.raw.family_father));
            words.add(new Word("Nenek","Sobo", R.drawable.family_grandmother, R.raw.family_father));

        WordAdapter adapter = new WordAdapter(this, words, R.color.category_family);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

        // Set a click listener to play the audio when the list item is clicked on
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                // Get the {@link Word} object at the given position the user clicked on
                Word word = words.get(position);

                // Create and setup the {@link MediaPlayer} for the audio resource associated
                // with the current word
                mMediaPlayer = MediaPlayer.create(FamilyActivity.this, word.getAudioResourceId());

                // Start the audio file
                mMediaPlayer.start();
            }
        });
    }
}
