package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();
            words.add(new Word("Satu","Ichi"));
            words.add(new Word("Dua","Ni"));
            words.add(new Word("Tiga","San"));
            words.add(new Word("Empat","Yon"));
            words.add(new Word("Lima","Go"));
            words.add(new Word("Enam","Roku"));
            words.add(new Word("Tujuh","Nana"));
            words.add(new Word("Delapan","Hachi"));
            words.add(new Word("Sembilan","Kyu"));
            words.add(new Word("Sepuluh","Ju"));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
         WordAdapter adapter = new WordAdapter(this, words);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml file.
         ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
         listView.setAdapter(adapter);

        // ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,words);
        // GridView grid = (GridView) findViewById(R.id.simpleGridView);
        // grid.setAdapter(itemsAdapter);

    }
}
