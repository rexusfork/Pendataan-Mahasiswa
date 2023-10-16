package com.example.putrautsmobi41.model;

public class Siswa {
    private String NomorIndukSiswa;
    private String NamSiswa;
    private String Kelas;
    private String JenisKelamin;
    private String TanggalLahir;

    public Siswa(){

    }

    public Siswa(String nomorIndukSiswa, String namSiswa, String kelas, String jenisKelamin, String tanggalLahir) {
        NomorIndukSiswa = nomorIndukSiswa;
        NamSiswa = namSiswa;
        Kelas = kelas;
        JenisKelamin = jenisKelamin;
        TanggalLahir = tanggalLahir;
    }

    public String getNomorIndukSiswa() {
        return NomorIndukSiswa;
    }

    public void setNomorIndukSiswa(String nomorIndukSiswa) {
        NomorIndukSiswa = nomorIndukSiswa;
    }

    public String getNamSiswa() {
        return NamSiswa;
    }

    public void setNamSiswa(String namSiswa) {
        NamSiswa = namSiswa;
    }

    public String getKelas() {
        return Kelas;
    }

    public void setKelas(String kelas) {
        Kelas = kelas;
    }

    public String getJenisKelamin() {
        return JenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        JenisKelamin = jenisKelamin;
    }

    public String getTanggalLahir() {
        return TanggalLahir;
    }

    public void setTanggalLahir(String tanggalLahir) {
        TanggalLahir = tanggalLahir;
    }
}
