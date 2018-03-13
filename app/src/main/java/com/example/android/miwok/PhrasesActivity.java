package com.example.android.miwok;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    private MediaPlayer mMediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        /*ArrayList<Word> words = new ArrayList<Word>();
            words.add(new Word("Selamat Pagi","Ohayo Gozaimasu", R.raw.phrase_what_is_your_name));
            words.add(new Word("Selamat Siang","Konnichiwa", R.raw.phrase_what_is_your_name));
            words.add(new Word("Selamat Malam","Konbanwa", R.raw.phrase_what_is_your_name));
            words.add(new Word("Selamat Beristirahat","Oyasumi Nasai", R.raw.phrase_what_is_your_name));
            words.add(new Word("Terima Kasih","Arigato Gozaimasu", R.raw.phrase_what_is_your_name));
            words.add(new Word("Permisi/Maaf","Sumimasen", R.raw.phrase_what_is_your_name));
            words.add(new Word("Apakah Ada Air","Omizu Arimasuka", R.raw.phrase_what_is_your_name));
            words.add(new Word("Ini Ada Dimana?","Kore Doko Desuka", R.raw.phrase_what_is_your_name));
            words.add(new Word("Apakah Hari Ini Buka?","Kyo Aitemasuka", R.raw.phrase_what_is_your_name));
            words.add(new Word("Harganya Berapa","Oikura Desuka?", R.raw.phrase_what_is_your_name));

        WordAdapter adapter = new WordAdapter(this, words, R.color.category_phrases);
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
        });*/
    }
}
