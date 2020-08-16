package com.example.kramertest;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

//    private FloatingActionButton fabMenu, fabSearch, fabNewCard;
//    private boolean isMenuOpen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bottomNav = findViewById(R.id.bottom_nav);
        bottomNav.setOnNavigationItemSelectedListener(navSelect);

//        fabMenu = findViewById(R.id.fab_menu);
//        fabSearch = findViewById(R.id.fab_new_card);
//        fabNewCard = findViewById(R.id.fab_new_card);

//        isMenuOpen = false;
//
//        fabMenu.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                if (isMenuOpen) {
//                    fabSearch.setVisibility(View.INVISIBLE);
//                    fabNewCard.setVisibility(View.INVISIBLE);
//
//                    isMenuOpen = false;
//                } else {
//                    fabSearch.setVisibility(View.VISIBLE);
//                    fabNewCard.setVisibility(View.VISIBLE);
//                    isMenuOpen = true;
//                }
//
//            }
//        });

    }


    private BottomNavigationView.OnNavigationItemSelectedListener navSelect =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    Fragment selectedFragment = null;

                    switch (item.getItemId()) {
                        case R.id.nav_home:
                            selectedFragment = new HomeFragment();
                            break;
                        case R.id.nav_list:
                            selectedFragment = new ToDoFragment();
                            break;
                        case R.id.nav_cards:
                            selectedFragment = new FlashcardsFragment();
                            break;
                        case R.id.nav_quiz:
                            selectedFragment = new QuizFragment();
                            break;
                    }

                    getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                            selectedFragment).commit();
                    return true;
                }
            };

}
