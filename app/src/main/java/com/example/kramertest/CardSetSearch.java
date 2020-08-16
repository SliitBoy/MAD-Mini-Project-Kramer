package com.example.kramertest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class CardSetSearch extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_set_search);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.cards_searchbar, menu);

        MenuItem cardSearch = menu.findItem(R.id.card_searchBar);
        SearchView searchView = (androidx.appcompat.widget.SearchView) cardSearch.getActionView();

        return true;
    }
}