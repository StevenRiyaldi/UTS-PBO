package edu.uph.SIAK.model;

public class mahasiswa {
    /* Nama Mahasiswa */
    String nama;
    
    
    public mahasiswa() {
    }

    public mahasiswa(String nama) {
        this.nama=nama;
    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    @Override
    public String toString() {
        return "" +
            " " + getNama() + "\t\t\t";
    }
}
    