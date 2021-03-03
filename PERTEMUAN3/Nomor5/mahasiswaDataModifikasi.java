package PERTEMUAN3.Nomor5;
import java.util.Scanner;
public class mahasiswaDataModifikasi {
    public static void main(String[] args) {
        Scanner h = new Scanner (System.in);
        System.out.println("----DATA MAHASISWA----");
        System.out.println();
        System.out.print( " Banyaknya Mahasiswa : ");
        int a = h.nextInt();
        mahasiswa1 [] mhs = new mahasiswa1[a];
        for (int i = 0; i< mhs.length; i++){
        System.out.println("Masukkan Data Mahasiswa ke- " + (i+1));
        System.out.println();
        System.out.println("Masukkan Nama Mahasiswa : ");
        String nm = h.nextLine();
        System.out.print("Masukkan NIM Mahasiswa :");
        String ni = h.nextLine();
        System.out.print("Masukkan Jenis Kelamin Mahasiswa : ");
        String jk= h.nextLine();
        System.out.print("Masukkan IPK Mahasiswa : ");
        double ip = h.nextDouble();
        System.out.println();
        mhs[i] = new mahasiswa1(nm, ni, jk, ip);
        }
        System.out.println("--------------------");
        System.out.println("HASIL DATA MAHASISWA");
        System.out.println("--------------------");
        for(int i =0; i <mhs.length; i++){
            System.out.println("Data mahasiswa ke-" + (i+1));
            mhs[i].tampil();
            System.out.println();
            double b = 0;            
            b += mhs[i].ipk;
            if (i == (mhs.length-1)){
                b /= mhs.length;
                System.out.println("Rata-Rata IPK Semua Mahasiswa Adalah " + b);
            }
        }

    }
    
}
