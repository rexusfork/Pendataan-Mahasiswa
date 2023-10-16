package com.example.putrautsmobi41.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.putrautsmobi41.R;
import com.example.putrautsmobi41.model.Kelas;

import java.util.ArrayList;
import java.util.List;

public class AdapterKelas extends RecyclerView.Adapter<AdapterKelas.ViewHolder>{
    private Context context;
    private ArrayList<Kelas> list;

    public AdapterKelas(Context context, ArrayList<Kelas> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_kelas,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Kelas model = list.get(position);
        holder.IDKELAS.setText(model.getIdKelas());
        holder.TYPEKELAS.setText(model.getTypeKelas());
        holder.LANTAIKELAS.setText(model.getLantai());
        holder.KAPASITASRUANGAN.setText(model.getKapasitas_Ruangan());
        holder.DESC_KELAS.setText(model.getDeskripsiKelas());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private TextView IDKELAS,TYPEKELAS,LANTAIKELAS,KAPASITASRUANGAN,DESC_KELAS;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            IDKELAS = itemView.findViewById(R.id.TextIDKelas);
            TYPEKELAS = itemView.findViewById(R.id.TypeKelas);
            LANTAIKELAS = itemView.findViewById(R.id.TextLantai);
            KAPASITASRUANGAN = itemView.findViewById(R.id.TextKapasitasRuangan);
            DESC_KELAS = itemView.findViewById(R.id.TextDeskripsiRuangan);
        }
    }


}
