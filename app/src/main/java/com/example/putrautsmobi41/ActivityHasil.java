package com.example.putrautsmobi41;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ActivityHasil extends AppCompatActivity {
    private TextView Nis,Nama,IDKelas,JenisKelamin,TanggalLahir;
    private Button BtnBack;

    private SharedPreferences preferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);
        InitViews();

        BtnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),MainActivityAdmin.class);
                startActivity(intent);
            }
        });
    }

    private void InitViews(){
        Nis = findViewById(R.id.YourNISHere);
        Nama = findViewById(R.id.YourNameHere);
        IDKelas = findViewById(R.id.YourIDClassHere);
        JenisKelamin = findViewById(R.id.YourGenderHere);
        TanggalLahir = findViewById(R.id.YourBirthDateHere);
        BtnBack = findViewById(R.id.BackData);
        preferences = getSharedPreferences("DataSiswa",MODE_PRIVATE);

        Nis.setText(preferences.getString("NIS","Default"));
        Nama.setText(preferences.getString("Nama", "Default"));
        IDKelas.setText(preferences.getString("Kelas", "Default"));
        JenisKelamin.setText(preferences.getString("Tanggal", "Default"));
        TanggalLahir.setText(preferences.getString("Gender", "Default"));
    }
}