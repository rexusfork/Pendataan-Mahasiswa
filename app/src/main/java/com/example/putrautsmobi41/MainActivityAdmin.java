package com.example.putrautsmobi41;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.putrautsmobi41.fragment.fragment_class;
import com.example.putrautsmobi41.fragment.fragment_home;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivityAdmin extends AppCompatActivity implements NavigationBarView.OnItemSelectedListener {
    private BottomNavigationView bottomNavigationView;
    private fragment_class FragmentClass = new fragment_class();
    private fragment_home  fragment_home = new fragment_home();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_admin);
        InitViews();
    }

    private void InitViews(){
        bottomNavigationView = findViewById(R.id.BottomNav);
        bottomNavigationView.setOnItemSelectedListener(this);
        bottomNavigationView.setSelectedItemId(R.id.HomeApps);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.HomeApps){
            getSupportFragmentManager().beginTransaction().replace(R.id.FrameMainActivityAdmin, fragment_home).commit();
            return true;
        } else if (item.getItemId() == R.id.ClassApps){
            getSupportFragmentManager().beginTransaction().replace(R.id.FrameMainActivityAdmin, FragmentClass).commit();
            return true;
        } else {
            return false;
        }
    }
}