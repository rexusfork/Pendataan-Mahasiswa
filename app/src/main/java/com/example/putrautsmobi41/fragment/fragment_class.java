package com.example.putrautsmobi41.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.putrautsmobi41.Adapter.AdapterKelas;
import com.example.putrautsmobi41.R;
import com.example.putrautsmobi41.model.Kelas;

import java.util.ArrayList;

public class fragment_class extends Fragment {
    private RecyclerView recyclerView;

    private ArrayList<Kelas> list;
    private AdapterKelas adapterKelas;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_class, container, false);
        InitViews(view);
        InitReyclerView();
        return view;
    }

    private void InitViews(View v){
        recyclerView = (RecyclerView) v.findViewById(R.id.ReyclerViewClass);
    }

    private void InitReyclerView(){
        list = new ArrayList<>();
        list.add(new Kelas("BA75","Regular","Lantai 1","32 Orang","Kelas Teori"));
        list.add(new Kelas("BB75","Regular","Lantai 1","32 Orang","Kelas Teori"));
        list.add(new Kelas("BC75","Regular","Lantai 2","32 Orang","Kelas Teori"));
        list.add(new Kelas("BD75","Regular","Lantai 2","32 Orang","Kelas Teori"));
        adapterKelas = new AdapterKelas(getContext(),list);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapterKelas);
    }
}