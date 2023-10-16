package com.example.putrautsmobi41;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    // View
    private EditText IDEdText, PasswordEdText;
    private Button BtnLogin;
    // Admin
    private String ID, Password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        InitViews();
        BtnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (IDEdText.getText().toString().equals("Admin") && PasswordEdText.getText().toString().equals("Admin")){
                    Toast.makeText(getApplicationContext(),"Login Berhasil", Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(getApplicationContext(),MainActivityAdmin.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(getApplicationContext(),"Login Gagal Coba Lagi", Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    private void InitViews(){
        ID = "Admin";
        Password = "Admin";
        IDEdText = (EditText) findViewById(R.id.EdTextID);
        PasswordEdText = (EditText) findViewById(R.id.EdTextPassword);
        BtnLogin = (Button) findViewById(R.id.BtnLogin);
    }
}