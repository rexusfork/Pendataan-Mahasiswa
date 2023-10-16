package com.example.putrautsmobi41.model;

public class Kelas {
    private String IdKelas;
    private String TypeKelas;
    private String Lantai;
    private String Kapasitas_Ruangan;
    private String DeskripsiKelas;

    public Kelas(){

    }

    public Kelas(String idKelas, String typeKelas, String lantai, String kapasitas_Ruangan, String deskripsiKelas) {
        IdKelas = idKelas;
        TypeKelas = typeKelas;
        Lantai = lantai;
        Kapasitas_Ruangan = kapasitas_Ruangan;
        DeskripsiKelas = deskripsiKelas;
    }

    public String getIdKelas() {
        return IdKelas;
    }

    public void setIdKelas(String idKelas) {
        IdKelas = idKelas;
    }

    public String getTypeKelas() {
        return TypeKelas;
    }

    public void setTypeKelas(String typeKelas) {
        TypeKelas = typeKelas;
    }

    public String getLantai() {
        return Lantai;
    }

    public void setLantai(String lantai) {
        Lantai = lantai;
    }

    public String getKapasitas_Ruangan() {
        return Kapasitas_Ruangan;
    }

    public void setKapasitas_Ruangan(String kapasitas_Ruangan) {
        Kapasitas_Ruangan = kapasitas_Ruangan;
    }

    public String getDeskripsiKelas() {
        return DeskripsiKelas;
    }

    public void setDeskripsiKelas(String deskripsiKelas) {
        DeskripsiKelas = deskripsiKelas;
    }
}
