package com.company;

import jdk.nashorn.api.tree.SimpleTreeVisitorES6;

public class GajiPegawai {
    private String nama;
    private String alamat;
    private int uangTransport;
    private int uangTunjangan;
    private int gajiPokok;
    private int totalGaji;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public int getUangTransport() {
        return uangTransport;
    }

    public void setUangTransport(int uangTransport) {
        this.uangTransport = uangTransport;
    }

    public int getUangTunjangan() {
        return uangTunjangan;
    }

    public void setUangTunjangan(int uangTunjangan) {
        this.uangTunjangan = uangTunjangan;
    }

    public int getGajiPokok() {
        return gajiPokok;
    }

    public void setGajiPokok(int gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    public int totalGaji(int uangTunjangan, int uangTransport, int gajiPokok){
        totalGaji = uangTunjangan + uangTransport + gajiPokok;
        return totalGaji;
    }

    public void tampilData(){
        System.out.println("Nama Karyawan : " +getNama());
        System.out.println("Alamat : " +getAlamat());
        System.out.println("Uang Transport : Rp. " +getUangTransport());
        System.out.println("Uang Tunjangan : Rp. " +getUangTunjangan());
        System.out.println("Gaji Pokok : " +getGajiPokok());
        System.out.println("TOTAL GAJI : " +totalGaji(getUangTunjangan(), getUangTransport(), getGajiPokok()));
    }
}
