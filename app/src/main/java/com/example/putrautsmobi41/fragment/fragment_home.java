package com.example.putrautsmobi41.fragment;

import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.example.putrautsmobi41.ActivityHasil;
import com.example.putrautsmobi41.MainActivity;
import com.example.putrautsmobi41.R;

import java.text.DateFormat;
import java.util.Calendar;

public class fragment_home extends Fragment {
    // View
    private EditText NIS,Nama,IDKelas;
    private RadioGroup Gender;
    private RadioButton radioBtn;
    private Button BtnBirthDate;
    private Button Save;
    private ImageButton BtnLogOut;
    // Preferences
    private SharedPreferences preferences;

    // Temp Data
    private String nis,nama,idkelas,gender,tanggallahir;
    private int Year, Month, Day;
    private int SelectID;
    private Dialog dialog;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        InitViews(view);

        BtnBirthDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopDatePicker(v);
            }
        });

        Save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nis = NIS.getText().toString();
                nama = Nama.getText().toString();
                idkelas = IDKelas.getText().toString();
                SelectID = Gender.getCheckedRadioButtonId();
                radioBtn = view.findViewById(SelectID);
                gender = radioBtn.getText().toString();
                if (nis.isEmpty() && nama.isEmpty() && idkelas.isEmpty() && tanggallahir.equals("Tanggal Lahir") && gender.isEmpty()){
                    Toast.makeText(getActivity(),"Isi semua formulir",Toast.LENGTH_LONG).show();
                } else {
                    SharedPreferences.Editor editor = preferences.edit();
                    editor.putString("NIS",nis);
                    editor.putString("Nama",nama);
                    editor.putString("Kelas", idkelas);
                    editor.putString("Tanggal",tanggallahir);
                    editor.putString("Gender", gender);
                    editor.apply();
                    Intent intent = new Intent(getActivity(), ActivityHasil.class);
                    startActivity(intent);
                }
            }
        });

        BtnLogOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DialogActivity();
            }
        });
        return view;
    }

    private void InitViews(View view){
        NIS = (EditText) view.findViewById(R.id.EdTextNIS);
        Nama = (EditText) view.findViewById(R.id.EdTextNama);
        IDKelas = (EditText) view.findViewById(R.id.EdTextKelas);
        Gender = (RadioGroup) view.findViewById(R.id.Status);
        BtnBirthDate = (Button) view.findViewById(R.id.BirthDate);
        Save = (Button) view.findViewById(R.id.SaveData);
        BtnLogOut = (ImageButton) view.findViewById(R.id.BtnLogOut);
        preferences = getActivity().getSharedPreferences("DataSiswa", Context.MODE_PRIVATE);
        dialog = new Dialog(getActivity());
    }

    private void PopDatePicker(View view){
        DatePickerDialog.OnDateSetListener onDateSetListener = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                Calendar calendar = Calendar.getInstance();
                calendar.set(Calendar.YEAR,year);
                calendar.set(Calendar.MONTH, month);
                calendar.set(Calendar.DAY_OF_MONTH,dayOfMonth);
                tanggallahir = DateFormat.getDateInstance(DateFormat.MEDIUM).format(calendar.getTime());
                BtnBirthDate.setText(tanggallahir);
                calendar.set(Calendar.YEAR, Year);
                calendar.set(Calendar.MONTH, Month);
                calendar.set(Calendar.DAY_OF_MONTH, Day);
            }
        };
        int Style = AlertDialog.THEME_DEVICE_DEFAULT_LIGHT;
        DatePickerDialog datePickerDialog = new DatePickerDialog(getActivity(),Style,onDateSetListener,Year,Month,Day);
        datePickerDialog.getDatePicker().setMinDate((System.currentTimeMillis())/ 1000 / 60 / 60 / 24 / 365);
        datePickerDialog.setTitle("Pick Your Birth Day");
        datePickerDialog.show();
    }

    private void DialogActivity(){
        dialog.setContentView(R.layout.item_dialog);
        dialog.getWindow().setBackgroundDrawable((new ColorDrawable(Color.TRANSPARENT)));
        Button BtnCancel = dialog.findViewById(R.id.BtnBatal);
        Button BtnKeluar = dialog.findViewById(R.id.BtnCancel);

        BtnKeluar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), MainActivity.class);
                startActivity(intent);
            }
        });

        BtnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });
        dialog.show();
    }
}