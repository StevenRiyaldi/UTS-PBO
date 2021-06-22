package edu.uph.SIAK.model;

public class matakuliah {
    String nama;
    String KodeKelas;
    int SKS;

    public matakuliah() {
    }

    public matakuliah( String KodeKelas, String nama, int SKS) {
        this.nama = nama;
        this.KodeKelas = KodeKelas;
        this.SKS = SKS;
    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKodeKelas() {
        return this.KodeKelas;
    }

    public void setKodeKelas(String KodeKelas) {
        this.KodeKelas = KodeKelas;
    }

    public int getSKS() {
        return this.SKS;
    }

    public void setSKS(int SKS) {
        this.SKS = SKS;
    }


    @Override
    public String toString() {
        return 
            getNama() + "," + " " +
            getKodeKelas() + "," + " " +
            getSKS() + " ";
    }
}

   