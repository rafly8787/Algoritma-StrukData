package PERTEMUAN3.Nomor4;
import java.util.Scanner;
public class mahasiswaData {
    public static void main(String[] args) {
        Scanner h = new Scanner (System.in);
        System.out.println("----DATA MAHASISWA----");
        System.out.println();
        System.out.print( " Banyaknya Mahasiswa : ");
        int a = h.nextInt();
        mahasiswa[] mhs = new mahasiswa[a];
        for (int i = 0; i< mhs.length; i++){
        mhs[i] = new mahasiswa();
        System.out.println("Masukkan Data Mahasiswa ke- " + (i+1));
       System.out.println("Masukkan Nama Mahasiswa : ");
       mhs[i].nama = h.nextLine();
        System.out.print("Masukkan NIM Mahasiswa :");
        mhs[i].nim = h.nextLine();
        System.out.println("Masukkan Jenis Kelamin Mahasiswa : ");
        mhs[i].jenisKelamin = h.nextLine();
        System.out.println("Masukkan IPK Mahasiswa : ");
        mhs[i].ipk = h.nextDouble();
        System.out.println();
        }
        System.out.println("--------------------");
        System.out.println("HASIL DATA MAHASISWA");
        System.out.println("--------------------");
        for(int i =0; i <mhs.length; i++){
            System.out.println("Data mahasiswa ke-" + (i+1));
            mhs[i].tampil();
        }
    }
}
