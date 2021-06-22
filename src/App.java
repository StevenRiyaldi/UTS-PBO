import edu.uph.SIAK.model.mahasiswa;
import edu.uph.SIAK.model.matakuliah;
import edu.uph.SIAK.model.kartuhasilstudi;


import java.util.Scanner;

public class App {
    /*
        Nama  : Steven Riyaldi
        NIM   : 03082200022
        Kelas : 20TI2
    */
    public static void main(String[] args) throws Exception {
        Scanner Input = new Scanner(System.in);
        int pilih;
        char yn = 'n';

        do{

            mahasiswa mhs1 = new mahasiswa("Calvin Wendy");
        
            matakuliah matakuliah1 = new matakuliah("MK001", "PBO", 3);
            matakuliah matakuliah2 = new matakuliah("MK002", "B.Indo", 4);
            matakuliah matakuliah3 = new matakuliah("MK003", "FIP", 4);


            kartuhasilstudi khs1 = new kartuhasilstudi(3,mhs1);
            khs1.tambahNilaiStudi(matakuliah1, 'A');
            khs1.tambahNilaiStudi(matakuliah2, 'B');
            khs1.tambahNilaiStudi(matakuliah3, 'C');

            mahasiswa mhs2 = new mahasiswa("Richard Tanoto");

            matakuliah matakuliah4 = new matakuliah("MK001", "PBO", 3);
            matakuliah matakuliah5 = new matakuliah("MK002", "B.Indo", 4);
            matakuliah matakuliah6 = new matakuliah("MK003", "FIP", 4);

            kartuhasilstudi khs2 = new kartuhasilstudi(3,mhs2);
            khs2.tambahNilaiStudi(matakuliah4, 'B');
            khs2.tambahNilaiStudi(matakuliah5, 'C');
            khs2.tambahNilaiStudi(matakuliah6, 'A');

            System.out.println("Nilai Mahasiswa");
            System.out.println("=======================");

            System.out.println("Pilih 1 : Tampilkan KHS");
            System.out.println("Pilih 2 : Exit");

            System.out.print("Pilih no : ");
            pilih = Input.nextInt();
            System.out.println("");
            
            if (pilih == 1){
                do{
                    System.out.println("List Mahasiswa");
                    System.out.println("1. Calvin Wendy");
                    System.out.println("2. Richard Tanoto");
                    System.out.println("Nomor ? ");
                    int pilihan = Input.nextInt();
                    if (pilihan == 1){
                        khs1.tampilkanKHS();
                        break;
                    }
                    else if (pilihan == 2){
                        khs2.tampilkanKHS();
                        break;
                    }
                }while(yn=='y' || yn=='Y');
            }
            else if(pilih == 2){
                break;
            }

            System.out.print("Ulangi perhitungan ? (y/n) : ");
            Input.nextLine();
            String yesno = Input.nextLine();
            yn = yesno.charAt(0);
        }while(yn=='y' || yn=='Y');
        System.out.println();
        Input.close();
    }
}