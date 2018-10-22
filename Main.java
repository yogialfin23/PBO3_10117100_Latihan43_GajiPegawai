package com.company;

/**
 * Yogie Alfin Salim
 * 10117100
 * IF-3
 */
public class Main {

    public static void main(String[] args) {
	GajiPegawai gp = new GajiPegawai();
        System.out.println("### Data Gaji Karyawan PT. KAKATU ###");
        System.out.println("=====================================");
        gp.setNama("Rizki Adam Kurniawan");
        gp.setAlamat("Jalan Semar dlm 4 No 72/66");
        gp.setUangTransport(250000);
        gp.setUangTunjangan(300000);
        gp.setGajiPokok(4500000);
        gp.tampilData();

    }
}
